import java.util.Scanner;

public class Petya_Strings {
    public static String check(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.equals(b))
            return "0";
        else {
            int result = a.compareTo(b);
            if (result < 0)
                return "-1";
            else
                return "1";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        sc.close();
        System.out.println(check(a, b));
    }
}