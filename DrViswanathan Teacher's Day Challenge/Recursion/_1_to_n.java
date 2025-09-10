public class _1_to_n {
    public static void logic(int n) {
        if (n == 0) {
            return;
        }
        logic(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        logic(6);
    }
}
