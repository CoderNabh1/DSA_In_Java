import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListCollectionsFramework {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();

        // 2. Add Operations
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.add("of"); // .add() defaults to addLast

        System.out.println(list); // Output: [is, a, list, of]

        list.add(2, "am");// --> Index Value
        list.addAll(Arrays.asList("I", "am"));

        list.clear(); // Head = null;

        list.clone();

        list.descendingIterator();

        list.wait();

        list.spliterator();
    }
}
