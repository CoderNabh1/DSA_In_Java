package Revision.Array.LeaderInArray;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void giveLeader(int arr[]) {
        ArrayList<Integer> leader = new ArrayList<>();
        leader.add(arr[arr.length - 1]);
        int lastB = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            if (lastB < arr[i - 1]) {
                lastB = arr[i - 1];
                leader.add(lastB);
            }
        }

        int ans[] = new int[leader.size()];
        int j = 0;
        for (int i = leader.size() - 1; i >= 0; i--) {
            ans[j++] = leader.get(i);
        }
        System.out.println("Leaders:");
        for (int num : ans) {
            System.out.print(num + " ");
        }
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
        giveLeader(arr);
    }
}
