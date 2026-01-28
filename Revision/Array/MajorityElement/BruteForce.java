package Revision.Array.MajorityElement;

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

        int maxCount = 0;
        int maxElement = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count >= maxCount) {
                maxCount = count;
                maxElement = arr[i];
            }
        }

        if (maxCount > arr.length / 2) {
            System.out.println("Max Element is:" + maxElement);
        } else {
            System.out.println("No Max Element");
        }
    }
}
