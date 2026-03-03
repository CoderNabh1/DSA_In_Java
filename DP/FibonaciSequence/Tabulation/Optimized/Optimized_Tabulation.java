package FibonaciSequence.Tabulation.Optimized;

import java.util.Scanner;

public class Optimized_Tabulation {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int sprev = 0;
        int prev = 1;
        int curr;

        for (int i = 2; i <= n; i++) {
            curr = sprev + prev;
            sprev = prev;
            prev = curr;
        }
        return prev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        sc.close();
        System.out.println("The fibinaci number of " + n + " is: " + fibonacci(n));
    }
}
