import java.util.LinkedList;
import java.util.Queue;

public class QueueImplemetation {
    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        System.out.print("Queue elements: ");
        for (int num : q) {
            System.out.print(num + " ");
        }
    };
}
