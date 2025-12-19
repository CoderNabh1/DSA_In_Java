public class LinkedListImplementation {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        public static void add(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            if (head == tail) {
                head = null;
                tail = null;
                return head.data;
            }
            int data = head.data;
            head = head.next;
            return data;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }

        public static void printList() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return;
            }
            Node track = head;
            while (track != null) {
                System.out.print(track.data + " ");
                track = track.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Queue q = new Queue();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            q.printList();
            q.remove();
            q.remove();
            q.add(10);
            q.printList();
        }
    }
}