package Revision.Array.RemoveDuplicates.Sorted;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int arr[] = new int[6];
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> sb = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        sc.close();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                sb.add(arr[i]);
            }
        }
        sb.add(arr[arr.length - 1]);
        for (int num : sb) {
            System.out.print(num);
        }
    }
}
