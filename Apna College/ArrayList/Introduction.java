import java.util.ArrayList;

public class Introduction {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        System.out.println(li);
        System.out.println("First Element:" + li.get(0));
        li.set(0, 7);
        System.out.println(li);
        li.remove(2);
        System.out.println(li);

    }
}