public class LinkedList {

    private class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next; // Move head forward
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is Empty...");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public void add(int index, String data) {
        if (index > size) {
            System.out.println("Invalid Index");
            return;
        }

        if (index == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node currNode = head;
        for (int i = 1; i < index; i++) { // Loop stops at index-1
            currNode = currNode.next;
        }
        newNode.next = currNode.next;
        currNode.next = newNode;
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

    public int getSize() {
        return size;
    }

    public void reverseList() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }

        if (head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;

            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node recursiveReverseList(Node head) {
        if (head == null) {
            System.out.println("Empty List");
            return head;
        }
        if (head.next == null) {
            return head;
        }
        Node newHead = recursiveReverseList(head.next);

        head.next.next = head;
        head.next = null;
        return newHead;
    }

    // Helper wrapper for recursion if needed
    public void reverseRecursiveHandlerWraper() {
        head = recursiveReverseList(head);
    }

    public static void main(String args[]) {
        LinkedList list = new LinkedList();

        list.addFirst("Garg");
        list.addFirst("Nabh");
        list.addFirst("is");
        list.addFirst("name");
        list.addFirst("My");
        list.addLast(".");
        System.out.println("The size of the list is: " + list.getSize());
        list.deleteLast();
        list.deleteFirst();
        list.printList();

        list.reverseList();
        list.printList();

        // 1. Pass 'list.head' because main is static
        // 2. Assign result back to 'list.head' to update the start of the list
        list.head = list.recursiveReverseList(list.head);
        list.printList();

        list.reverseRecursiveHandlerWraper();
        list.printList();

        System.out.println("The size of the list is: " + list.getSize());
    }
}