package Revision.Streams.Gemini;

import java.util.stream.Stream;

public class InfiniteGenerator {
    public static void main(String[] args) {
        System.out.println("---- Powers of 3 -----");
        Stream.iterate(1, n -> n * 3).limit(10).forEach(System.out::println);
    }
}
