package Revision.Streams.EngineeringDigest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperation {
    public static void main(String[] args) {

        // 1. Filter
        List<String> list = Arrays.asList("Akshit", "Ram", "Shyam");
        Stream<String> filterStream = list.stream().filter(x -> x.startsWith("A"));

        long res = list.stream().filter(x -> x.startsWith("A")).count();

        // 2. map
        Stream<String> mapStream = list.stream().map(x -> x.toUpperCase());
    }
}
