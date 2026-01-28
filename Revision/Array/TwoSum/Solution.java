package Revision.Array.TwoSum;

import java.util.HashSet;

public class Solution {
    public static void main(String args[]) {
        int arr[] = { 6, 5, 8 };
        int target = 14;

        HashSet<Integer> set = new HashSet<>();
        int sol[] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            int finder = target - arr[i];
            if (set.contains(finder)) {
                sol[0] = finder;
                sol[1] = arr[i];
                System.out.println("Yes");
                break;
            }
            set.add(arr[i]);
        }

        for (int nums : sol) {
            System.out.println(nums);
        }
    }
}
