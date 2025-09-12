public class Count_Number_of_Zeroes {
    public static int helper(int n) {
        return n % 10;
    }

    public static int countZeroes(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            n = -n;
        }
        if (n < 10) {
            return (n == 0) ? 1 : 0;
        }
        int count = (helper(n) == 0) ? 1 : 0;
        return count + countZeroes(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(countZeroes(100));
        System.out.println(countZeroes(1000));
        System.out.println(countZeroes(123));
        System.out.println(countZeroes(0));
    }
}