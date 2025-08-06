import java.util.Scanner;

public class Team {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        int count = 0;
        for (int i = 0; i < inp; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a + b + c >= 2) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}