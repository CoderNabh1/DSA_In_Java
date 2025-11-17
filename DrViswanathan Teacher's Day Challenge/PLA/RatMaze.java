public class RatMaze {
    // Define the size of the maze (N x N)
    final int N = 4;

    // =================================================================
    // Function 1: printSolution - Purpose: Display the resulting path.
    // =================================================================
    void printSolution(int sol[][]) {
        // Loop through each row of the solution matrix
        for (int i = 0; i < N; i++) {
            // Loop through each column of the solution matrix
            for (int j = 0; j < N; j++)
                // Print the value (1 for path, 0 for not on path)
                System.out.print(" " + sol[i][j] + " ");

            // Move to the next line after printing a row
            System.out.println();
        }
    }

    // =================================================================
    // Function 2: isSafe - Purpose: Check if a move is valid.
    // =================================================================
    // This function checks three conditions before the rat moves to (x, y):
    // 1. Is the position (x, y) within the maze boundaries?
    // 2. Is the cell (x, y) not blocked in the original maze?
    boolean isSafe(int maze[][], int x, int y) {
        // x >= 0 && x < N: Checks if 'x' (row index) is within 0 to N-1 (top/bottom
        // bounds).
        // y >= 0 && y < N: Checks if 'y' (column index) is within 0 to N-1 (left/right
        // bounds).
        // maze[x][y] == 1: Checks if the cell in the actual maze is an open path (1)
        // and not a wall (0).
        return (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1);
    }

    // =================================================================
    // Function 3: solveMaze - Purpose: Main function to start the solution process.
    // =================================================================
    public boolean solveMaze(int maze[][]) {
        // Initialize the solution matrix 'sol' with all zeros.
        // This matrix will store the final path (1s) found by the rat.
        int sol[][] = { { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 } };

        // Start the recursive backtracking from the initial position (0, 0).
        // If solveMazeUtil returns false, it means no path was found.
        if (solveMazeUtil(maze, 0, 0, sol) == false) {
            System.out.print("Solution doesn't exist");
            return false;
        }

        // If a path was found, print the resulting solution matrix.
        printSolution(sol);
        return true;
    }

    // =================================================================
    // Function 4: solveMazeUtil - Purpose: Recursive backtracking core function.
    // =================================================================
    // Finds the path from (x, y) to (N-1, N-1).
    boolean solveMazeUtil(int maze[][], int x, int y, int sol[][]) {

        // **Base Case (Success Condition)**:
        // Check if the rat has reached the destination (bottom-right cell).
        if (x == N - 1 && y == N - 1) {
            sol[x][y] = 1; // Mark the destination as part of the path
            return true;
        }

        // **Recursive Step**:
        // 1. Check if the current cell (x, y) is a safe place to move to.
        if (isSafe(maze, x, y) == true) {

            // Mark the current cell as part of the potential solution path.
            sol[x][y] = 1;

            // **Recursive Call 1: Try moving Down (x + 1, y)**
            // If moving down leads to a solution, return true immediately.
            if (solveMazeUtil(maze, x + 1, y, sol))
                return true;

            // **Recursive Call 2: Try moving Right (x, y + 1)**
            // This is only executed if moving Down failed.
            // If moving right leads to a solution, return true immediately.
            if (solveMazeUtil(maze, x, y + 1, sol))
                return true;

            // **Backtrack**:
            // If NEITHER moving Down nor moving Right from (x, y) resulted in a full path,
            // then (x, y) is not on the solution path.
            sol[x][y] = 0; // Unmark the current cell (x, y)
            return false;
        }

        // If the current cell (x, y) is not safe (out of bounds or blocked wall),
        // return false.
        return false;
    }

    // =================================================================
    // Main Method
    // =================================================================
    public static void main(String args[]) {
        RatMaze rat = new RatMaze();

        // Define the maze: 1 is path, 0 is wall.
        int maze[][] = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 } };

        // Call the main solver function
        rat.solveMaze(maze);
    }
}