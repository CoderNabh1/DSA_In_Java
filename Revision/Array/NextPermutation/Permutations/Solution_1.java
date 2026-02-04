package Permutations;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Solution_1 {
    public static void recurPermute(int arr[]) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean freq[] = new boolean[arr.length];
        recurAns(arr, ans, ds, freq);
        System.out.println("Permutations: " + ans);
    }

    public static void recurAns(int arr[], List<List<Integer>> ans, List<Integer> ds, boolean freq[]) {
        if (ds.size() == arr.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!freq[i]) {
                freq[i] = true;
                ds.add(arr[i]);
                recurAns(arr, ans, ds, freq);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Number:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        recurPermute(arr);
    }
}
