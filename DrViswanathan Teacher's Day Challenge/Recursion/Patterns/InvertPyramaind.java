public class InvertPyramaind {
    public static int Logic(int r, int c) {
        if (r == 0) {
            return 0;
        }
        for (int i = 0; i < r; i++) {
            System.out.print("*");
        }
        System.out.println();
        return Logic(r - 1, c);
    }

    public static void main(String[] args) {
        Logic(4, 4);
    }
}
