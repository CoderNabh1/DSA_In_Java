public class Problem_2 {
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

    public Node reverseHalf() {
        if (head == null) {
            return null;
        }
        int size = 0;
        Node fast = head;

        while (fast != null) {
            fast = fast.next;
            size++;
        }

        int middle = size / 2;
        Node slow = head;

        for (int i = 0; i < middle; i++) {
            slow = slow.next;
        }

        Node prev = slow;
        Node curr = slow.next;

        while (curr != null) {
            Node next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        slow.next = null;
        return prev;
    }

    public boolean PalinromeCheck() {
        Node left = head;
        Node right = reverseHalf();

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        reverseHalf();
        return true;
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
        Problem_2 list = new Problem_2();

        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        if (list.PalinromeCheck() == true) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
    }
}