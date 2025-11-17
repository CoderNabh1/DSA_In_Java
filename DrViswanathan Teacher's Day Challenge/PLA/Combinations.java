import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static int fact(int n) {
        int i = 1;
        int j = 1;

        while (j <= n) {
            i = i * j;
            j++;
        }
        return i;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(9);
        numbers.add(12);
        numbers.add(19);
        numbers.add(61);
        numbers.add(19);

        int n = numbers.size();
        int r = 2;
        int result;

        result = fact(n) / (fact(r) * fact(n - r));

        System.out.println("There are " + result + " no. of ways to choose " + r + " items from " + n);
    }
}
