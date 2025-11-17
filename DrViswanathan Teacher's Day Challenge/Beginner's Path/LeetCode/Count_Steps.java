public class Count_Steps {
    public static int Steps(int n) {
        if (n == 0) {
            return 0;
        }
        int count = 1;
        if (n % 2 == 0) {
            return count + Steps(n / 2);
        } else {
            return count + Steps(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(Steps(14)); // Output: 6
        System.out.println(Steps(8)); // Output: 4
        System.out.println(Steps(0)); // Output: 0
        System.out.println(Steps(1)); // Output: 1
    }
}