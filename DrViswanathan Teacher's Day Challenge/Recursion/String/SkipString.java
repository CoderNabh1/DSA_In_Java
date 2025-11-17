public class SkipString {
    public static String skip(String init) {
        if (init.isEmpty()) {
            return init;
        }
        String check = "apple";
        if (init.startsWith(check)) {
            return init.substring(5);
        } else {
            return init.charAt(0) + skip(init.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(skip("applaaabcdgapplsappeapple"));
    }
}
