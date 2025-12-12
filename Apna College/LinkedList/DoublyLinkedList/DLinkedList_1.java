package DoublyLinkedList;

public class DLinkedList_1 {
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;
    Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode; // CRITICAL: The first node is both head and tail
        }
        // Case 2: The list is not empty
        else {
            head.prev = newNode; // Link old head back to new node
            newNode.next = head; // Link new node forward to old head
            head = newNode; // Update head pointer
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("Empty List");
        }
        Node current = head;
        System.out.print("null <-> ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void printdreverse() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        Node current = tail;
        System.out.print("null <-> ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }

    // We need two arguments: WHERE to add (index) and WHAT to add (data)
    public void addAtIndex(int index, int data) {
        // 1. Handle invalid index or adding to the start
        if (index < 0) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node curr = head;

        // 2. Traverse to the node JUST BEFORE where we want to insert (index - 1)
        for (int i = 0; i < index - 1; i++) {
            if (curr == null) {
                System.out.println("Index out of bounds");
                return;
            }
            curr = curr.next;
        }

        // 3. Check if we ran off the end of the list
        if (curr == null) {
            System.out.println("Index out of bounds");
            return;
        }

        // 4. Handle inserting at the very end
        if (curr.next == null) {
            addLast(data);
            return;
        }

        // --- THE INSERTION LOGIC ---

        Node nextNode = curr.next; // Save the reference to the node ahead!

        // Link the New Node to its neighbors
        newNode.prev = curr;
        newNode.next = nextNode;

        // Link the neighbors to the New Node
        curr.next = newNode;
        nextNode.prev = newNode;
    }

    public void delete(int index, int data) {
        if (index < 0) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 0) {
            head = null;
            return;
        }
        Node newNode = new Node(data);
        Node curr = tail;
        int size = 0;

        while (curr != null) {
            curr = curr.prev;
            size++;
        }
        tail = curr;

        for (int i = 0; i < (size - index - 1); i++) {
            curr = curr.prev;
        }
        if (curr == null) {
            System.out.println("Index out of bounds");
            return;
        }

        if (curr.prev == null) {
            head = null;
            curr.next = head;
        }

        Node nextNode = curr.next.next;

    }

    public static void main(String[] args) {
        DLinkedList_1 list = new DLinkedList_1();

        list.addFirst(4);
        list.addLast(5);
        list.addFirst(3);
        list.addLast(6);
        list.addFirst(2);
        list.addFirst(1);
        list.printList();
        list.printdreverse();
        list.addAtIndex(6, 7);
        list.printList();
        list.addAtIndex(6, 8);
        list.printList();
    }
}
