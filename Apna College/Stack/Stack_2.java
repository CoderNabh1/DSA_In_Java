import java.util.Stack;

public class Stack_2 {

    // LOGIC: Correct! This moves S to T keeping the same order.
    public static void exchange(Stack<Integer> s, Stack<Integer> t) {
        // Use 'if' instead of 'while' for a base case (though while works too)
        if (s.isEmpty()) {
            return;
        }

        // 1. Remove top element (e.g., 1)
        int val = s.pop();

        // 2. Recursively call until S is empty
        exchange(s, t);

        // 3. Push element into T as the recursion unwinds
        t.push(val);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Stack<Integer> t = new Stack<>();

        s.push(4); // Bottom
        s.push(3);
        s.push(2);
        s.push(1); // Top

        System.out.println("Stack S is ready: " + s);

        // COMMENTED THIS OUT to prevent emptying S
        /*
         * while (!s.isEmpty()) {
         * System.out.println(s.peek());
         * s.pop();
         * }
         */

        exchange(s, t);

        System.out.println("After Exchange (Stack T):");
        while (!t.isEmpty()) {
            System.out.println(t.peek());
            t.pop();
        }
    }
}