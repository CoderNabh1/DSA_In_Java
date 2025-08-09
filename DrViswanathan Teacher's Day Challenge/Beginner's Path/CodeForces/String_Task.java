import java.util.Scanner;

public class String_Task {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        inp = inp.toLowerCase();
        for (int i = 0; i < inp.length(); i++) {
            char c = inp.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'y') {
                System.out.print("." + c);
            }
        }
        sc.close();
    }
}