import java.util.Stack;

public class MinStack_2 {

    public static int minStack(Stack<Integer> k) {
        // 1. Base Case: If stack is empty, return a very large number (infinity)
        // so it won't be smaller than any real element.
        if (k.isEmpty()) {
            return -1;
        }

        // 2. Pop the top element to hold it in the stack frame
        int val = k.pop();

        // 3. Recursive Step: Find the minimum in the REST of the stack
        int minInRest = minStack(k);

        // 4. Comparison: The min for THIS level is the smaller of:
        // - The value we just popped (val)
        // - The minimum found in the rest of the stack (minInRest)
        int finalMin = Math.min(val, minInRest);

        // 5. Restore the stack (Backtracking)
        k.push(val);

        // 6. Return the final minimum found
        return finalMin;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(8);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(0);

        System.out.println("Minimum element in the stack is: " + minStack(s));

        // Optional: Verify the stack is still intact
        System.out.println("Stack after function: " + s);
    }
}