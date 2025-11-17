public class NQueen {
    final int N = 4;

    public void board(int arr[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(arr[i][j]);
                System.out.println();
            }
        }
    }

    public boolean isSafe(int arr[][], int col, int row) {
        int i, j;
        for (i = 0; i < col; i++) { /* Checks for Horizontal attacks from left */
            if (arr[row][i] == 1) {
                return false;
            }
        }
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (arr[i][j] == 1) { /* Checks for upper left diagonal */
                return false;
            }
        }

        for (i = row, j = col; j >= 0 && i < N; i++, j--) {
            if (arr[i][j] == 1) { /* Checks for lower left diagonal */
                return false;
            }
        }

        return true;
    }

    public boolean solvenqueen(int arr[][], int col) {
        if (col >= N) {
            return true;
        }
    }

}
