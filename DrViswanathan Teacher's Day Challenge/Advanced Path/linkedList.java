public class linkedList {

    // Node class to represent an element in the linked list
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head; // The head of the list

    // Constructor to initialize an empty list
    public linkedList() {
        this.head = null;
    }

    /**
     * Inserts a new node with the given data at the end of the list.
     *
     * @param data The data to be inserted.
     */
    public void insert(int data) {
        Node newNode = new Node(data);

        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
        } else {
            // Traverse to the last node
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            // Add the new node at the end
            current.next = newNode;
        }
    }

    /**
     * Displays all the elements of the list.
     */
    public void display() {
        Node current = head;
        if (current == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    /**
     * Deletes the first occurrence of a node with the given data.
     *
     * @param data The data of the node to be deleted.
     */
    public void delete(int data) {
        // If the list is empty, do nothing
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // If the head node is the one to be deleted
        if (head.data == data) {
            head = head.next;
            System.out.println("Deleted " + data + " from the list");
            return;
        }

        Node current = head;
        Node prev = null;

        // Search for the node to be deleted
        while (current != null && current.data != data) {
            prev = current;
            current = current.next;
        }

        // If the data was found (current is not null)
        if (current != null) {
            // Bypass the node to be deleted
            prev.next = current.next;
            System.out.println("Deleted " + data + " from the list.");
        } else {
            // The data was not found in the list
            System.out.println(data + " not found in the list.");
        }
    }

    // Main method to test the LinkedList
    public static void main(String[] args) {
        linkedList myList = new linkedList();

        System.out.println("--- Inserting elements ---");
        myList.insert(10);
        myList.insert(20);
        myList.insert(30);
        myList.display();

        System.out.println("\n--- Deleting 20 ---");
        myList.delete(20);
        myList.display();

        System.out.println("\n--- Deleting 10 ---");
        myList.delete(10);
        myList.display();

        System.out.println("\n--- Deleting 40 (not in list) ---");
        myList.delete(40);
        myList.display();

        System.out.println("\n--- Deleting 30 ---");
        myList.delete(30);
        myList.display();

        System.out.println("\n--- Deleting from an empty list ---");
        myList.delete(50);
    }
}