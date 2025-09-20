public class SkipCharacter {
    public static String skip(String last, String init) {
        if (init.isEmpty()) {
            return last;
        }
        char ch = init.charAt(0);

        if (ch == 'a') {
            return skip(last, init.substring(1));
        } else {
            return skip(last + ch, init.substring(1));
        }
    }

    public static String skip_2(String init) {
        if (init.isEmpty()) {
            return init;
        }
        char ch = init.charAt(0);

        if (ch == 'a') {
            return skip_2(init.substring(1));
        } else {
            return ch + skip_2(init.substring(1));
        }
    }

    public static void main(String[] args) {
        String a = "aabbccaaddaaeeaaff";
        System.out.println(skip("", a));
        System.out.println(skip_2(a));
    }
}