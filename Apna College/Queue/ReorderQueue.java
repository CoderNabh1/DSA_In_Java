import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReorderQueue {
    public static void patternReorder(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        int middle = q.size() / 2;
        int count = 0;
        while (count != middle) {
            s.push(q.remove());
            count++;
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        count = 0;
        while (count != middle) {
            s.push(q.remove());
            count++;
        }
        count = 0;
        while (count != middle) {
            count++;
            q.add(s.pop());
            q.add(q.remove());
        }
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        patternReorder(q);
        for (int num : q) {
            System.out.print(num + " ");
        }
    }
}
