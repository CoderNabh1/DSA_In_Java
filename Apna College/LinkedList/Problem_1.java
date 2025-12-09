public class Problem_1 {
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Fixed addFirst Method
    public void addFirst(int data) {
        Node newNode = new Node(data);
        // If head is null, newNode.next becomes null (correct).
        // If head exists, newNode.next points to old head (correct).
        newNode.next = head;
        head = newNode;
    }

    // Renamed for clarity. This is the "Two-Pass" approach.
    public void removeNthFromEnd(int n) {
        if (head == null)
            return;

        // --- PASS 1: Calculate Size ---
        int size = 0;
        Node curr = head;
        while (curr != null) {
            size++;
            curr = curr.next; // Fixed: Move pointer forward!
        }

        // Edge Case: If trying to remove the Head (e.g., size is 5, n is 5)
        if (n == size) {
            head = head.next;
            return;
        }

        // --- PASS 2: Move to the node BEFORE the one to delete ---
        // We need to stop at index: size - n - 1
        int indexToSearch = size - n;
        curr = head;

        for (int i = 1; i < indexToSearch; i++) {
            curr = curr.next;
        }

        // Perform deletion
        curr.next = curr.next.next;
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
        Problem_1 list = new Problem_1();

        // Adding: 5 -> 4 -> 3 -> 2 -> 1
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);

        System.out.println("Original List:");
        list.printList();

        // Remove 2nd from end (Value 2)
        list.removeNthFromEnd(2);

        System.out.println("After Removal:");
        list.printList();
    }
}