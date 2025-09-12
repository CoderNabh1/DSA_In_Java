public class Revesring_Numhber {
    static int sum = 0;

    public static void logic_1(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        logic_1(n / 10);
    }

    public static int helperlogic_2(int num) {
        int digits = (int) (Math.log10(num)) + 1;
        return logic_2(num, digits);
    }

    public static int logic_2(int num, int digits) {
        if (num % 10 == num) {
            return num;
        }
        int l_digit = num % 10;
        return l_digit * (int) Math.pow(10, digits - 1) + logic_2(num / 10, digits);
    }

    public static void main(String[] args) {
        logic_1(123456);
        System.out.println(sum);
        System.out.println(helperlogic_2(654321));
    }
}
