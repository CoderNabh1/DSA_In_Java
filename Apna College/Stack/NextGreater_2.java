import java.util.*;

public class NextGreater_2 {
    public static void nextGreaterFromStart(int arr[]) {
        int next[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        // Logic: Store INDICES in the stack
        for (int i = 0; i < arr.length; i++) {
            // While the current element (arr[i]) is greater than the element
            // at the index stored in the stack, we found the "Next Greater"
            while (!s.isEmpty() && arr[i] > arr[s.peek()]) {
                next[s.peek()] = arr[i];
                s.pop();
            }
            s.push(i);
        }

        // IMPORTANT: Any indices remaining in the stack imply
        // there is no greater element to their right.
        while (!s.isEmpty()) {
            next[s.pop()] = -1;
        }

        // Print the results
        System.out.println("Next Greater Elements:");
        for (int i = 0; i < next.length; i++) {
            System.out.println(arr[i] + " -> " + next[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        nextGreaterFromStart(arr);
    }
}