public class N_th_From_end_Problem_4 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Corrected addLast method
    public void addLast(int data) {
        Node newNode = new Node(data);

        // 1. Handle empty list
        if (head == null) {
            head = newNode; // Corrected: assign newNode TO head
            return;
        }

        Node curr = head;
        // 2. Traverse until the LAST node (not null)
        while (curr.next != null) {
            curr = curr.next;
        }

        // 3. Link the last node to the new node
        curr.next = newNode;
    }

    public Node findingNode(int data) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        int size = 0;
        Node curr = head;
        int node;
        while (curr != null) {
            curr = curr.next;
            size++;
        }

        node = size - data;
        curr = head;
        for (int i = 0; i < node; i++) {
            curr = curr.next;
        }
        return curr;
    }
}