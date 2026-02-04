package Revision.Array.MaxSubArraySum;

import java.util.Scanner;

public class BruteForce {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int maxSum = 0;
        int start = -1;
        int end = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = arr[k] + sum;
                }
                if (sum > maxSum) {
                    maxSum = sum;
                    start = i;
                    end = j;
                }
            }
        }
        int res[] = new int[end - start + 1];
        int index = 0;
        for (int i = start; i <= end; i++) {
            res[index++] = arr[i];
        }
        System.out.println("Max Subarray:");
        for (int num : res) {
            System.out.println(num);
        }
    }
}