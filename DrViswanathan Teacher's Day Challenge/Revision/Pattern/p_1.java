import java.util.Scanner;

public class p_1 {
    public static int helper(int a) {
        if (a == 0) {
            return 0;
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("*");
        }
        System.out.println();
        return helper(a - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many time you want pattern to print:");
        int t = sc.nextInt();
        helper(t);
        sc.close();
    }
}
