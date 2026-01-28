package Revision.Array.MajorityElement;

import java.util.Scanner;
import java.util.Arrays;

public class better {
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
        Arrays.sort(arr);

        int maxCount = 1;
        int maxElement = arr[0];
        int count = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count >= maxCount) {
                maxCount = count;
                maxElement = arr[i];
            }
        }

        if (maxCount + 1 > arr.length / 2) {
            System.out.println("Max Element is :" + maxElement);
        } else {
            System.out.println("No Max Element");
        }
    }
}