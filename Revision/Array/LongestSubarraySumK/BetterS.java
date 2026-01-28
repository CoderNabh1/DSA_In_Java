package Revision.Array.LongestSubarraySumK;

public class BetterS {
    public static int[] SolveSubArr(int arr[], int q) {
        int maxL = 0; // Initialize to 0, not MIN_VALUE (length can't be negative)
        int start = -1;
        int end = -1;

        // Loop 1: Start point
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum = arr[j] + currentSum;
                // Check condition
                if (currentSum == q) {
                    int currentLength = j - i + 1;
                    if (currentLength > maxL) {
                        maxL = currentLength;
                        start = i;
                        end = j;
                    }
                }
            }
        }

        // Handle case where no subarray is found
        if (start == -1) {
            System.out.println("No subarray found with sum " + q);
            return new int[] {};
        }

        // Create and fill result array
        int subArr[] = new int[maxL];
        int index = 0; // Separate index for the new array
        for (int i = start; i <= end; i++) {
            subArr[index++] = arr[i]; // Correct copying
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        return subArr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 4, 1, 1, 1, 4, 3 };
        int q = 3;
        SolveSubArr(arr, q);
    }
}