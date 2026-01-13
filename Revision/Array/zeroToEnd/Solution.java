package Revision.Array.zeroToEnd;

import java.util.Scanner;

public class Solution {
    public static void shiftZero(int arr[]) {
        if (arr.length <= 0) {
            return;
        }

        int slow = 0;
        int fast = 0;

        while (fast != arr.length - 1) {
            if (arr[slow] != 0) {
                slow++;
            }
            fast++;
            if (arr[slow] == 0 && arr[fast] != 0) {
                int temp = arr[slow];
                arr[slow] = arr[fast];
                arr[fast] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        shiftZero(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
