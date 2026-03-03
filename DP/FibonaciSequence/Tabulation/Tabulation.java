package FibonaciSequence.Tabulation;

import java.util.Scanner;

public class Tabulation {
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;

        // Tabulation table
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        // Bottom-up iteration
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        System.out.println("Fibonacci value at " + n + " is: " + fibonacci(n));
        sc.close();
    }
}
