package Revision.Array.FindOnceNumber;
// In this Question we are finding the number that we will appear Once.

public class Solution {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
        int XOR = 0;

        if (arr.length == 0) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            XOR = XOR ^ arr[i];
        }

        if (XOR == 0) {
            System.out.println("No Element Found");
        } else {
            System.out.println("Single Element is:" + XOR);
        }
    }
}
