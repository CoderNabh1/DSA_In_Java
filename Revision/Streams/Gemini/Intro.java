package Revision.Streams.Gemini; // Added package declaration

import java.util.function.Predicate;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

class LevelOne { // Changed from public to package-private
    public static void main(String[] args) {
        MathOperation subtraction = (a, b) -> a - b;

        System.out.println("10-5 = " + subtraction.operate(10, 5));

        Predicate<Integer> isPositive = x -> x > 0;
        System.out.println("Is 10 positive? " + isPositive.test(10));
        System.out.println("Is -5 positive? " + isPositive.test(-5));
    }
}
