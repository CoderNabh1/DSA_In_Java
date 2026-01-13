package Revision.Array.LeftRotateArray;

import java.util.Scanner;

public class Solution {

    // FIXED: Standard Two-Pointer Reversal Logic
    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void LeftRotateArray(int arr[], int k) {
        if (arr.length == 0)
            return;

        // Step 1: Reverse the first k elements (0 to k-1)
        reverse(arr, 0, k - 1);

        // Step 2: Reverse the remaining elements (k to n-1)
        reverse(arr, k, arr.length - 1);

        // Step 3: Reverse the entire array (0 to n-1)
        reverse(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Get Array Size
        // Hardcoded n=5 in your example, but dynamic is better:
        System.out.print("Enter Array Size (n): ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        // 2. Get Rotation Amount
        System.out.print("Left Rotate by (k): ");
        int k = sc.nextInt();
        // Handle case where k > n
        k = k % n;

        // 3. Get Array Elements
        System.out.println("Enter " + n + " Digits:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        // 4. Perform Rotation
        LeftRotateArray(arr, k);

        // 5. Output
        System.out.println("After Rotation:");
        for (int num : arr) {
            System.out.print(num + " "); // Added space for readability
        }
    }
}