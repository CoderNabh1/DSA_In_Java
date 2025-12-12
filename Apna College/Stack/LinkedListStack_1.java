public class LinkedListStack_1 {
    static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        public static node head;

        public static boolean isEmpty() {
            if (head == null) {
                return true;
            }
            return false;
        }

        public void push(int data) {
            node newNode = new node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            int top = head.data;
            return top;
        }

        public void printSt() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return;
            }
            node curr = head;
            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next; // Move to the next node
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Stack stack = new Stack();
            for (int i = 5; i >= 0; i--) {
                stack.push(i);
            }
            stack.printSt();
        }
    }
}
