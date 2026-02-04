package Revision.Array.BuyandSellStock;

import java.util.Scanner;

public class BruteForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minPrice) {
                minPrice = arr[i];
            }
            int profit = arr[i] - minPrice;
            if (maxProfit < profit) {
                maxProfit = profit;
            }
        }

        System.out.println("Profit:" + (maxProfit));
    }
}