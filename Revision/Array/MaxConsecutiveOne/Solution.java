package Revision.Array.MaxConsecutiveOne;

public class Solution {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1 };

        int i = 0;
        int max = 0;
        int count = 0;
        while (i < arr.length) {
            if (arr[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            i++;
            max = Math.max(count, max);
        }
        System.out.println("No. of Max Consecutive One's:" + max);
    }
}