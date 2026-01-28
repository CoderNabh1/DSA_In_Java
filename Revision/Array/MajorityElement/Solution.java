package Revision.Array.MajorityElement;

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

        int maxCount = 0;
        int maxElement = 0;
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (count == 0) {
                count = 1;
                maxElement = arr[i];
            } else if (arr[i] == maxElement) {
                count++;
            } else {
                count--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == maxElement) {
                maxCount++;
            }
        }

        if (maxCount > arr.length / 2) {
            System.out.println("Max Element:" + maxElement);
        } else {
            System.out.println("No Max Element");
        }
    }
}
