package Revision.Array.SetMatrixZeroes;

import java.util.ArrayList;
import java.util.Scanner;

public class better {
    public static int[][] makezero(int arr[][]) {
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> column = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 0) {
                    row.add(i);
                    column.add(j);
                }
            }
        }

        int r = 0;
        int c = 0;
        while (r < row.size() && c < column.size()) {

            for (int k = 0; k < arr.length; k++) {
                arr[row.get(r)][k] = 0;
            }
            r++;
            for (int k = 0; k < arr.length; k++) {
                arr[k][column.get(c)] = 0;
            }
            c++;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];
        System.out.println("Enter Values:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        makezero(arr);
    }
}
