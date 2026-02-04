package Permutations;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Solution_2 {
    public static void computePermute(int index, int arr[], List<List<Integer>> ans) {
        if (index == arr.length) {
            List<Integer> ds = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                ds.add(arr[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(i, index, arr);
            computePermute(index + 1, arr, ans);
            swap(i, index, arr);
        }
    }

    public static void swap(int i, int j, int arr[]) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        List<List<Integer>> ans = new ArrayList<>();
        computePermute(0, arr, ans);
        System.out.println("Permutations:");
        System.out.println(ans);
    }
}
