public class JosephusTrap {
    static int Joseph(int n, int k) {
        if (n == 1) {
            return 1;
        } else {
            return ((Joseph(n - 1, k) + k - 1) % n + 1);
        }
    }

    public static void main(String[] args) {

        int n = 14;
        int k = 2;
        System.out.println("The chosen place is " + Joseph(n, k));
    }
}
