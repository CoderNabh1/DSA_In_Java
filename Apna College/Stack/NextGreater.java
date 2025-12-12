import java.util.Stack;

public class NextGreater {

    public static void UsingArray(int arr[]) {
        // Brute Force: O(N^2)
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    System.out.print(arr[j] + " ");
                    break;
                }
                if (j == arr.length - 1) {
                    System.out.print(-1 + " ");
                }
            }
        }
        System.out.print(-1);
        System.out.println();
    }

    public static void UsingStack(int arr[]) {
        Stack<Integer> s = new Stack<>();
        int[] nextGreater = new int[arr.length];

        // 1. Manually handle the last element
        // The last element always has no greater element to its right, so -1.
        nextGreater[arr.length - 1] = -1;

        // CORRECTION: Push the actual value from 'arr', not 'nextGreater'
        s.push(arr[arr.length - 1]);

        // 2. Traverse backwards starting from the second to last element
        for (int i = arr.length - 2; i >= 0; i--) {
            // While stack is not empty AND top of stack <= current element
            // pop the stack because those small numbers are useless now
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }
            // If stack is empty, it means there is no greater element on the right
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                // The top of the stack is the next greater element
                nextGreater[i] = s.peek();
            }
            // Push current element to stack to be a candidate for elements on the left
            s.push(arr[i]);
        }

        // Print results
        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 1, 8, 6, 3, 4 };

        System.out.print("Using Array: ");
        UsingArray(arr);

        System.out.print("Using Stack: ");
        UsingStack(arr);
    }
}