package Revision.Array.MissingNumber;

public class BetterSolution {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5 };
        int n = arr.length + 1;

        n = ((n + 1) * n) / 2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        int res = n - sum;
        System.out.println("Missing Number:" + res);
    }
}
