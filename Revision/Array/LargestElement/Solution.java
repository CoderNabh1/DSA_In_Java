package Revision.Array.LargestElement;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int arr[] = new int[6];
        Scanner sc = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int num : arr) {
            if (largest < num) {
                largest = num;
            }
        }
        System.out.println(largest);
    }
}
