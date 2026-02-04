package Revision.Array.LongestConsecutiveSequence;

import java.util.Scanner;
import java.util.Arrays;

public class BruteForce {
    public static int[] findLongestSequence(int arr[]) {
        if (arr == null || arr.length == 0)
            return new int[0];

        Arrays.sort(arr);

        int currentLength = 1;
        int maxLength = 1;
        int start = 0; // Temporary start of current sequence
        int fstart = 0; // Final start of longest sequence found

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == 1) {
                // Consecutive: increment current length
                currentLength++;
            } else if (arr[i] - arr[i - 1] == 0) {
                // Duplicate: skip it, don't break the sequence
                continue;
            } else {
                // Gap found: check if current sequence was the longest
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    fstart = start;
                }
                // Reset for new sequence
                currentLength = 1;
                start = i;
            }
        }

        // Final check for sequence ending at the very last element
        if (currentLength > maxLength) {
            maxLength = currentLength;
            fstart = start;
        }

        // Fix extraction: Fill exactly maxLength unique elements
        int ans[] = new int[maxLength];
        ans[0] = arr[fstart];
        int j = 1;
        for (int i = fstart + 1; j < maxLength; i++) {
            // Only add to result if it's not a duplicate of the previous element
            if (arr[i] != arr[i - 1]) {
                ans[j++] = arr[i];
            }
        }

        System.out.println("Longest Consecutive Sequence:");
        for (int num : ans) {
            System.out.print(num + " ");
        }
        System.out.println(); // New line for cleanliness
        return ans;
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
        findLongestSequence(arr);
    }
}