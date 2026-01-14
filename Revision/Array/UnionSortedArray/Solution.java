package Revision.Array.UnionSortedArray;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        int arr_1[] = { 1, 1, 2, 2, 3, 4, 5, 6 };
        int arr_2[] = { 2, 3, 3, 6, 7, 8, 9 };

        ArrayList<Integer> unionList = findUnion(arr_1, arr_2);

        for (int val : unionList) {
            System.out.print(val + " ");
        }
    }

    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> list = new ArrayList<>();

        // Traverse both arrays
        while (i < n && j < m) {
            // Case 1: arr1 element is smaller
            if (arr1[i] <= arr2[j]) {
                // Add if list is empty OR last element is different
                if (list.size() == 0 || list.get(list.size() - 1) != arr1[i]) {
                    list.add(arr1[i]);
                }
                i++;
            }
            // Case 2: arr2 element is smaller
            else {
                if (list.size() == 0 || list.get(list.size() - 1) != arr2[j]) {
                    list.add(arr2[j]);
                }
                j++;
            }
        }

        // Handle remaining elements in arr1
        while (i < n) {
            if (list.size() == 0 || list.get(list.size() - 1) != arr1[i]) {
                list.add(arr1[i]);
            }
            i++;
        }

        // Handle remaining elements in arr2
        while (j < m) {
            if (list.size() == 0 || list.get(list.size() - 1) != arr2[j]) {
                list.add(arr2[j]);
            }
            j++;
        }

        return list;
    }
}