package Revision.Array.LongestSubarraySumK;

import java.util.Scanner;

public class Revision_BruteForce {
    public static int[] checkSum(int arr[], int n) {
        int s = -1;
        int t = -1;
        int maxL = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = arr[k] + sum;
                }
                if (sum == n) {
                    int currentLength = j - i + 1;
                    if (currentLength > maxL) {
                        maxL = currentLength;
                        s = i;
                        t = j;
                    }
                }
            }
        }

        int srr[] = new int[maxL];
        int index = 0;
        for (int i = s; i <= t; i++) {
            arr[index++] = arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        return srr;
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
