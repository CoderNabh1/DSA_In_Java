package Revision.Array.LongestSubarraySumK;

import java.util.Scanner;

public class SolutionSlidingWindow {
    public static int[] checkSum(int arr[], int n) {
        int start = 0;
        int end = 0;
        int maxL = 0;
        int sum = 0;
        int bestStart = -1;
        int bestEnd = -1;
        while (end < arr.length) {
            sum = sum + arr[end];
            while (sum > n && start <= end) {
                sum = sum - arr[start];
                start++;
            }

            if (sum == n) {
                int currentLength = end - start + 1;
                if (currentLength > maxL) {
                    maxL = currentLength;
                    bestStart = start;
                    bestEnd = end;
                }
            }
            end++;
        }
        int subArr[] = new int[maxL];
        int index = 0;
        for (int i = bestStart; i <= bestEnd; i++) {
            subArr[index++] = arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // For a clean output
        return subArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of Array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter K:");
        int k = sc.nextInt();
        sc.close();
        checkSum(arr, k);
    }
}
