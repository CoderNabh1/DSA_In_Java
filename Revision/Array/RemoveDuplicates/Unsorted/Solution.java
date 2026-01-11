package Revision.Array.RemoveDuplicates.Unsorted;

import java.util.HashSet;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];

        System.out.println("Enter 6 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        int narr[] = new int[set.size()];

        int index = 0;
        for (int num : set) {
            narr[index++] = num;
        }

        System.out.println("Array after removing duplicates:");
        for (int num : narr) {
            System.out.print(num + " ");
        }
    }
}