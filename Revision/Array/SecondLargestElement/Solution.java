package Revision.Array.SecondLargestElement;

import java.util.Scanner;

public class Solution {
    public static int LargestElement(int arr[]) {
        int Largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Largest) {
                Largest = arr[i];
            }
        }
        return Largest;
    }

    public static void main(String[] args) {
        int arr[] = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int largest = LargestElement(arr);
        int secondLarge = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLarge && arr[i] != largest) {
                secondLarge = arr[i];
            }
        }
        System.out.println(secondLarge);
    }
}
