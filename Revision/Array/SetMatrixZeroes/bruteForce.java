package Revision.Array.SetMatrixZeroes;

import java.util.Scanner;

public class bruteForce {
    public static void makeminus(int arr[][], int i, int j) {
        for (int k = 0; k < arr.length; k++) {
            if (arr[i][k] != 0) {
                arr[i][k] = -1;
            }
        }
        for (int k = 0; k < arr.length; k++) {
            if (arr[k][j] != 0) {
                arr[k][j] = -1;
            }
        }
    }

    public static void makezero(int arr[][]) {
        for (int k = 0; k < arr.length; k++) {
            for (int n = 0; n < arr.length; n++) {
                if (arr[k][n] == -1) {
                    arr[k][n] = 0;
                }
            }
        }
        System.out.println("Zero Matrix:--");
        for (int k = 0; k < arr.length; k++) {
            for (int n = 0; n < arr.length; n++) {
                System.out.print(arr[k][n]);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];
        System.out.println("Enter Values:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 0) {
                    makeminus(arr, i, j);
                }
            }
        }
        makezero(arr);
    }
}