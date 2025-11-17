
public class RatMazePractice {
    final int N = 4;

    public void printSolution(int sol[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(" " + sol[i][j] + " ");
            }
        }
    }

    public boolean Check(int maze[][], int x, int y) {
        return (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1);
    }

    public boolean solveMaze(int maze[][]) {
        int sol[][] = { { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 } };

        if (solveMazeUtil(maze, 0, 0, sol) == false) {
            System.out.println("Solution doesn't exist");
            return false;
        }

        printSolution(sol);
        return true;
    }

    public boolean solveMazeUtil(int maze[][], int x, int y, int sol[][]) {
        if (x == N - 1 && y == N - 1) {
            sol[x][y] = 1;
            return true;
        }

        if (Check(maze, x, y) == true) {
            sol[x][y] = 1;

            if (solveMazeUtil(maze, x + 1, y, sol)) {
                return true;
            }

            if (solveMazeUtil(maze, x, y + 1, sol)) {
                return true;
            }

            sol[x][y] = 0;
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        RatMazePractice rat = new RatMazePractice();
        int maze[][] = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 } };

        rat.solveMaze(maze);
    }
}
