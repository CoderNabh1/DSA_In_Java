public class HomeworkLL_1 {
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    public HomeworkLL_1() {
        size = 0;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public int search(int data) {
        if (head == null) {
            return -1;
        }
        Node currNode = head;
        int index = 0;
        while (currNode != null) {
            if (currNode.data == data) {
                return index;
            }
            index++;
            currNode = currNode.next;
        }
        return -1;
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("Empty list");
        }

        if (head.data == data) {
            head = head.next;
            size--;
            return;
        }

        Node prevNode = head;
        Node currNode = prevNode.next;
        Node nextNode = currNode.next;

        while (currNode != null) {
            if (currNode.data == data) {
                prevNode.next = currNode.next; // The Link Skip
                size--;
            }
            // Update pointers for next iteration
            prevNode = currNode;
            currNode = currNode.next;
        }
    }

    public void printList() {

        if (head == null) {
            System.out.println("Empty List");
            return;
        }

        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public static void main(String args[]) {
        HomeworkLL_1 list = new HomeworkLL_1();

        list.addFirst(1);
        list.addFirst(5);
        list.addFirst(7);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(8);
        list.addFirst(3);
        System.out.println(list.search(7));
        System.out.println("Index of 100: " + list.search(100));
        list.delete(3);
        list.printList();

    }
}