package FibonaciSequence.Memoization;

import java.util.Scanner;

public class Fibonaci_Memoization {
    // Static array shared by all calls
    static int[] dp;

    public static int fibonaci(int n) {
        if (n <= 1)
            return n;

        // Check the global array
        if (dp[n] != 0)
            return dp[n];

        dp[n] = fibonaci(n - 1) + fibonaci(n - 2);
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        // Initialize the global array based on user input
        dp = new int[n + 1];

        System.out.println("Result: " + fibonaci(n));
        sc.close();
    }
}
