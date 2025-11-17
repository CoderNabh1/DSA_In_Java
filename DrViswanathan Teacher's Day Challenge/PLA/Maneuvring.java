public class Maneuvring {
    public static int NumberOfPaths(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }

        return NumberOfPaths(m - 1, n) + NumberOfPaths(n, m - 1) + NumberOfPaths(m - 1, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(NumberOfPaths(3, 3));
    }
}