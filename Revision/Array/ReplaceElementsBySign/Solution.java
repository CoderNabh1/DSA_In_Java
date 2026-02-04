package Revision.Array.ReplaceElementsBySign;

import java.util.ArrayList;
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

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }
        }
        int i = 0;
        int j = 0;
        int k = 0;

        while (j < pos.size() && k < neg.size()) {
            arr[i++] = pos.get(j++);
            arr[i++] = neg.get(k++);
        }

        while (j < pos.size()) {
            arr[i++] = pos.get(j++);
        }

        while (k < neg.size()) {
            arr[i++] = neg.get(k++);
        }

        System.out.println("Arranged Order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
