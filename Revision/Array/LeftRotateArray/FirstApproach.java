package Revision.Array.LeftRotateArray;

import java.util.Scanner;

public class FirstApproach {
    public static void LeftRotate(int arr[], int k) {
        if (k == 0) {
            return;
        }
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        LeftRotate(arr, k - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int arr[] = new int[n];
        System.out.print("Left Rotate Array by K elements:");
        int k = sc.nextInt();
        k = k % n;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        LeftRotate(arr, k);
        for (int num : arr) {
            System.out.print(num);
        }
    }
}
