public class FibonacciRecusrsion {
    public static int logic(int n) {
        if (n < 2) {
            return n;
        }
        return logic(n - 1) + logic(n - 2);
    }

    public static void main(String args[]) {
        System.out.println(logic(7));
    }
}
