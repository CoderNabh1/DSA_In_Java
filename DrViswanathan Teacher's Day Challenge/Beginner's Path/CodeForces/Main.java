import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();

        // Consume the newline character left after sc.nextInt()
        sc.nextLine();

        ArrayList<String> words = new ArrayList<String>();

        for (int i = 0; i < inp; i++) {
            String s = sc.nextLine();
            if (s.length() > 10) {
                String abbreviated = "" + s.charAt(0) + (s.length() - 2) + s.charAt(s.length() - 1);
                words.add(abbreviated);
            } else {
                words.add(s);
            }
        }

        for (String word : words) {
            System.out.println(word);
        }

        sc.close();
    }
}