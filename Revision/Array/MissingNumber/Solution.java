package Revision.Array.MissingNumber;

public class Solution {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 6 };
        int XOR1 = 0;
        int XOR2 = 0;
        for (int i = 0; i < arr.length; i++) {
            XOR1 = XOR1 ^ (i + 1);
            XOR2 = XOR2 ^ arr[i];
        }

        XOR1 = XOR1 ^ arr.length + 1;
        int res = XOR1 ^ XOR2;
        System.out.println("Missing Element:" + res);
    }
}
