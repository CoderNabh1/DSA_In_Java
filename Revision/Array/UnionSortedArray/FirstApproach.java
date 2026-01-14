package Revision.Array.UnionSortedArray;
import java.util.HashSet;

public class FirstApproach {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 45, 5, 6 };
        int karr[] = { 1, 23, 0, 98, 7, 65 };

        HashSet<Integer> set = new HashSet<>();

        // Add elements from the first array
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        // Add elements from the second array
        // FIXED: Changed arr[i] to karr[i]
        for (int i = 0; i < karr.length; i++) {
            set.add(karr[i]);
        }

        int union[] = new int[set.size()];
        int i = 0;

        // Transfer elements from Set to Array
        for (int num : set) {
            union[i] = num;
            i++;
        }

        System.out.print("Union: ");
        // FIXED: Reset loop variable to start from 0
        for (int j = 0; j < union.length; j++) {
            System.out.print(union[j] + " ");
        }
    }
}