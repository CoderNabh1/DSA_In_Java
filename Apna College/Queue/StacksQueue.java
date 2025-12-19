import java.util.*;

public class StacksQueue {
    public static class Queue {
        // Use Generics <Integer> to define the type
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // Enqueue Costly - O(N)
        public static void add(int data) {
            // 1. Move all elements from s1 to s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            // 2. Push the new item to s1 (which is now empty)
            s1.push(data);

            // 3. Move everything back to s1
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // Dequeue Efficient - O(1)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            // s1 always has the oldest element at the top
            return s1.pop();
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        // Test the Queue
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("Removing: " + q.remove()); // Should be 1
        System.out.println("Removing: " + q.remove()); // Should be 2
        System.out.println("Peek: " + q.peek()); // Should be 3
    }
}