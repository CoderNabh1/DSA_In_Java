
public class ArrayImplementation {
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;

        Queue(int size) {
            arr = new int[size];
            this.size = size;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static void add(int val) {
            if (rear == size - 1) {
                System.out.println("Full Queue");
                return;
            }
            rear++;
            arr[rear] = val;
        }

        public static int remove() {
            if (rear == -1) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int front = arr[0];

            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        public static int peek() {
            if (rear == -1) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[0];
        }

        public void printQueue() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        System.out.println(q.peek());
        q.printQueue();
    }
}
