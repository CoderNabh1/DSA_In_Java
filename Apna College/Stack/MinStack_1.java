import java.util.Stack;

public class MinStack_1 {

    public static int minStack(Stack<Integer> k) {
        Stack<Integer> t = new Stack<>();
        int min = k.peek();
        while (!k.isEmpty()) {
            if (k.peek() < min) {
                min = k.peek();
            }
            t.push(k.pop());
        }
        while (!t.isEmpty()) {
            k.push(t.pop());
        }
        return min;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(8);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(0);
        System.out.println("Minimum element in the stack is:" + minStack(s));
    }
}
