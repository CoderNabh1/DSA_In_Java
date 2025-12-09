public class LoopProblem_3 {

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

    // Corrected makeLoop method
    // This example connects the Tail to the Head to create a circular list
    public void makeLoop() {
        if (head == null)
            return;

        Node curr = head;

        // Traverse to the very last node
        while (curr.next != null) {
            curr = curr.next;
        }

        // Create the loop: Point the last node back to the head
        // (You can change 'head' to any other node to make a customized loop)
        curr.next = head.next;

        System.out.println("Loop created");
    }

    // Helper to print first N nodes (to verify loop without infinite loop)
    public void printList(int limit) {
        Node curr = head;
        int count = 0;
        while (curr != null && count < limit) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
            count++;
        }
        System.out.println(count == limit ? "(stopped to avoid infinite print)" : "null");
    }

    public boolean detectLoop() {
        if (head == null || head.next == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public Node getMeetingPoint() {
        if (head == null || head.next == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return slow;
            }
        }
        return null;
    }

    public void RemoveLoop() {
        if (getMeetingPoint() == null) {
            return;
        }

        Node slow = head;
        Node fast = getMeetingPoint();

        if (slow == fast) {
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null; // Break the link from Tail to Head
            return;
        }

        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
    }

    public static void main(String[] args) {
        LoopProblem_3 list = new LoopProblem_3();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        // Before Loop
        System.out.print("Before Loop: ");
        list.printList(10);

        // Create Loop
        list.makeLoop();

        // After Loop (printing 10 nodes to show the cycle 1-2-3-4-1-2...)
        System.out.print("After Loop:  ");
        list.printList(10);

        if (list.detectLoop() == true) {
            System.out.println("Loop is present.");
        } else {
            System.out.println("There is no loop.");
        }

        list.RemoveLoop();

        System.out.println("After removal of Loop");
        list.printList(10);
    }
}