package Revision.Array.MaxSubArraySum;

import java.util.Scanner;

public class Solution {
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
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

            if (maxSum < sum) {
                maxSum = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println("Maximum Sum:");
        System.out.println(maxSum);
    }
}
