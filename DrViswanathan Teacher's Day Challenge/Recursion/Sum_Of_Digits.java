public class Sum_Of_Digits {
    public static int Logic(int n) {
        if (n <= 1) {
            return 0;
        }
        return Logic(n / 10) + n % 10;
    }

    public static void main(String[] args) {
        int result = Logic(5435678);
        System.out.println(result);
    }
}
