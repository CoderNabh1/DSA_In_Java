import java.util.Scanner;

public class divisorSum {

    public static int Solve(int num) {
        int sum = 0;

        if (num == 0) {
            return 0;
        }

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int num = sc.nextInt();
        sc.close();
        int result = Solve(num);
        System.out.println("Sum is:" + result);
    }
}
