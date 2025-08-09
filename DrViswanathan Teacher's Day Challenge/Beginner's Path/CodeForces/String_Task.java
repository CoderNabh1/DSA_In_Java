import java.util.Scanner;

public class String_Task {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        inp = inp.replace("A", "");
        inp = inp.replace("E", "");
        inp = inp.replace("I", "");
        inp = inp.replace("O", "");
        inp = inp.replace("U", "");
        inp = inp.replace("Y", "");
        inp = inp.toLowerCase();

        sc.close();
    }
}
