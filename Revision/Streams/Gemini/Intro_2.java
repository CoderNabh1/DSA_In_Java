package Revision.Streams.Gemini;

@FunctionalInterface

interface StringJoiner {
    String join(String x, String y);
}

public class Intro_2 {
    public static void main(String[] args) {
        StringJoiner spaceJoiner = (x, y) -> x + " " + y;

        System.out.println(spaceJoiner.join("Hello", "World"));
    }
}
