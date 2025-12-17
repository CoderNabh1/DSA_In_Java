import java.util.*;

class HistogramRectangle_2 {
    public static int[] nextSmaller(int arr[]) {
        // This array will store the INDEX of the next smaller element for each position
        int[] nextSmallerIndices = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        // 1. Traverse from Right to Left
        for (int i = arr.length - 1; i >= 0; i--) {
            // 2. Remove elements from stack that are NOT smaller (>= current)
            // We want the stack top to be strictly smaller than arr[i]
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            // 3. If stack is empty, no smaller element exists on right
            // We use arr.length as the boundary for area calculation
            if (s.isEmpty()) {
                nextSmallerIndices[i] = arr.length;
            } else {
                // The top of the stack is the index of the first smaller element
                nextSmallerIndices[i] = s.peek();
            }
            // 4. Push current index to stack
            s.push(i);
        }
        return nextSmallerIndices;
    }

    public static int[] previousSmaller(int arr[]) {
        int[] prevSmallerIndices = new int[arr.length];
        Stack<Integer> t = new Stack<>();

        for (int i = 1; i < arr.length; i++) {
            while (!t.isEmpty() && arr[i] <= arr[t.peek()]) {
                t.pop();
            }
            if (t.isEmpty()) {
                prevSmallerIndices[i] = -1;
            } else {
                prevSmallerIndices[i] = t.peek();
            }
            t.push(i);
        }

        return prevSmallerIndices;
    }

    public static int calculate(int arr[]) {
        int[] nextSmall = nextSmaller(arr);
        int[] prevSmall = previousSmaller(arr);

        int maxArea = 0;

        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];

            // FIXED: Width formula is (next - prev - 1)
            int width = nextSmall[i] - prevSmall[i] - 1;

            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3, 0, 2, 1, 5, 6, 2, 3 };
        int result = calculate(arr);
        System.out.println("Max Area:" + result);
    }
}

// Why the values arr.length and -1?
// Imagine the array { 5, 6 }.
// For 5:Previous Smaller: There is nothing to the left.
// The imaginary boundary is -1.
// Next Smaller: There is nothing smaller to the right.
// The imaginary boundary is 2 (the length).
// Width: $2 - (-1) - 1 = 2$. (Correct width for the base of 5).
// If you used 0 for both boundaries, the math would be: $0 - 0 - 1 = -1$.
// You would get a negative width!