package Revision.Array.SearchElement;

import java.util.Scanner;

public class Solution_1 {
    public static int find(int arr[], int k) {
        if (arr.length <= 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == k) {
                return mid;
            }

            else if (arr[mid] < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Number to Search:");
        int k = sc.nextInt();
        System.out.println("Enter Numbers:-");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        if (find(arr, k) == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element Found at " + find(arr, k));
        }
    }
}
