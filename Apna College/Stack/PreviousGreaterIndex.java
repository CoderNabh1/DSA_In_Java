import java.util.Stack;

public class PreviousGreaterIndex {
    public static void previousGreater(int arr[]) {

        int prev[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                prev[i] = 1;
            } else {
                prev[i] = i - s.peek();
            }

            s.push(i);
        }

        for (int i : prev) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 100, 80, 60, 70, 60, 75, 85 };
        previousGreater(arr);
    }
}
