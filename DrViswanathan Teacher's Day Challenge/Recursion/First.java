
public class First {
    public static void Add(int n) {
        if (n > 4) {
            System.out.println(n);
            return;
        }
        Add(n + 1);
    }

    public static void main(String[] args) {
        int a = 1;
        Add(a);
    }
}