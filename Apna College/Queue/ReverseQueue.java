import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Scanner;

public class ReverseQueue {
    public static void reverse(Queue<Integer> q, int k) {
        if (q.isEmpty() || k > q.size() || k <= 0) {
            return; // Basic error handling
        }

        Stack<Integer> s = new Stack<>();
        int size = q.size(); // Store total size (Important!)

        // Step 1: Push first K elements into Stack
        for (int i = 0; i < k; i++) {
            s.push(q.remove());
        }

        // Step 2: Add Stack elements back to Queue
        // Queue now looks like: [Remaining elements... , Reversed K elements...]
        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        // Step 3: Move the (Size - K) remaining elements to the back
        // We need to rotate the queue so the Reversed K elements come to the front.
        for (int i = 0; i < size - k; i++) {
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("Original: " + q);

        System.out.print("Enter K to reverse: ");
        int k = sc.nextInt();

        reverse(q, k);

        System.out.println("Result:   " + q);
    }
}