package Revision.Array.LongestConsecutiveSequence;

import java.util.Scanner;
import java.util.HashSet;

public class Solution {
    public static int[] findLongestConsecutive(int arr[]) {
        if (arr.length == 0 || arr.length == 1) {
            return arr;
        }

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        int i = 0;
        int maxCount = 0;
        int count = 1;
        int j = 1;
        int fstart = -1;

        while (i < arr.length) {
            if (set.contains(arr[i] - 1)) {
                i++;
            } else {
                if (set.contains(arr[i] + j)) {
                    count++;
                    j++;
                } else {
                    if (count > maxCount) {
                        maxCount = count;
                        fstart = arr[i];
                    }
                    i++;
                    j = 1;
                    count = 1;
                }
            }
        }
        int ans[] = new int[maxCount];
        int index = 0;
        for (int k = fstart; k < maxCount + fstart; k++) {
            ans[index++] = k;
        }
        System.out.println("Longest Consecutive Elements:");
        for (int num : ans) {
            System.out.print(num + " ");
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        findLongestConsecutive(arr);
    }
}
