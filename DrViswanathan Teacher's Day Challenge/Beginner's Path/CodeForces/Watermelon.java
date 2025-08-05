import java.util.Scanner;

class Watermelon {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        if (inp % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}