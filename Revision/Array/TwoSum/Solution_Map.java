package Revision.Array.TwoSum;

import java.util.HashMap;
import java.util.HashSet;

public class Solution_Map {
    public static void main(String args[]) {
        int arr[] = { 6, 5, 8 };
        int target = 14;

        HashMap<Integer, Integer> set = new HashMap<>();
        int sol[] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            int finder = target - arr[i];
            if (set.containsKey(finder)) {
                sol[0] = set.get(finder);
                sol[1] = i;
                System.out.println("Yes");
                break;
            }
            set.put(arr[i], i);
        }

        for (int nums : sol) {
            System.out.println(nums);
        }
    }
}