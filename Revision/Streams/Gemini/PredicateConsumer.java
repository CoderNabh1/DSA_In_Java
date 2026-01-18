package Revision.Streams.Gemini;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateConsumer {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 9, 10);

        // 1. Define Predicate: Takes an Integer 'n', returns true if divisible by 3
        Predicate<Integer> isDivBy3 = n -> n % 3 == 0;

        // 2. Define Consumer: Takes an Integer 'n', returns nothing (void), just prints
        // Note: You had a typo "Cosumer" -> "Consumer"
        Consumer<Integer> prettyPrinter = n -> System.out.println("Found number: " + n);

        System.out.println("--- Processing Stream ---");

        // 3. Use them!
        numbers.stream()
                .filter(isDivBy3) // Pass the predicate variable
                .forEach(prettyPrinter); // Pass the consumer variable
    }
}