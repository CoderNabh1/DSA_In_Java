public class CycleQueueArrayImplement {
    public static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int size) {
            arr = new int[size];
            this.size = size;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        public static void add(int val) {
            if (isEmpty()) {
                rear = val;
                front = val;
                return;
            }
            if (isFull()) {
                System.out.println("Queue is full...");
            }
            if (front == -1) {
                front++;
            }
            rear = (rear + 1) % size;
            arr[rear] = val;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is full");
                return -1;
            }
            int result = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty.");
                return -1;
            }
            return arr[front];
        }

        public static void printQueue() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
            }

            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(8);
        q.add(7);
        q.add(3);
        q.add(4);
        q.add(5);
        q.remove();
        q.remove();
        q.add(1);
        q.add(2);

    }
}
