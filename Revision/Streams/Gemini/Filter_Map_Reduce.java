package Revision.Streams.Gemini;

import java.util.Arrays;
import java.util.List;

public class Filter_Map_Reduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int result = numbers.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 2)
                .reduce(0, (sum, x) -> sum + x); // Fixed lambda expression
        System.out.println("Sum of Squares of Evens: " + result);
    }
}
