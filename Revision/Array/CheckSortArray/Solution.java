package Revision.Array.CheckSortArray;

import java.util.Scanner;

public class Solution {
    public static boolean checkSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        if (checkSort(arr)) {
            System.out.println("Yes,It is sorted");
        } else {
            System.out.println("No,it is not sorted");
        }
    }
}
