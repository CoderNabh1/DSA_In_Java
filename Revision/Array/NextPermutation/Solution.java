import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void computeNextPermutation(int arr[]) {
        // STEP 1: Find the "Pivot" (the number that breaks the descending order)
        int pivot = -1;
        // We look for the first index 'i' from the right where arr[i] < arr[i+1]
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pivot = i;
                break;
            }
        }

        // STEP 2: Handle Edge Case (Last Permutation)
        // If pivot is still -1, the array is like [3, 2, 1]. Next is [1, 2, 3]
        if (pivot == -1) {
            reverse(arr, 0, arr.length - 1);
        } else {
            // STEP 3: Find the "Successor"
            // The smallest number to the right of pivot that is larger than arr[pivot]
            // Since the right side is descending, the first one from the right is the
            // smallest larger.
            int successorIndex = -1;
            for (int i = arr.length - 1; i > pivot; i--) {
                if (arr[i] > arr[pivot]) {
                    successorIndex = i;
                    break;
                }
            }

            swap(arr, pivot, successorIndex);

            // STEP 5: Reverse the "Tail"
            // Everything to the right of the pivot position must be flipped to ascending
            reverse(arr, pivot + 1, arr.length - 1);
        }

        System.out.println("Next Permutation:");
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        computeNextPermutation(arr);
    }
}