package Revision.Streams.Gemini;

import java.util.Arrays;
import java.util.List;

public class MethodRefrence {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("rohit", "bob", "charlie");

        System.out.println("----- Uppercase ----");

        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
