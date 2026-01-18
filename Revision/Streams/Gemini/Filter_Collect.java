package Revision.Streams.Gemini;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Collect {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("Original: " + numbers);

        List<Integer> evens = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println("Evens: " + evens);
    }
}
