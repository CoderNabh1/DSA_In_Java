public class InRange {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void printInRange(int x, int y, Node root) {
        if (root == null) {
            return;
        }

        if (root.data > x) {
            printInRange(x, y, root.left);
        }

        if (root.data >= x && root.data <= y) {
            System.out.print(root.data + " ");
        }

        if (root.data < y) {
            printInRange(x, y, root.right);
        }
    }

    public static void main(String[] args) {
        int[] values = { 50, 30, 70, 20, 40, 60, 80 };
        Node root = null;
        int Srange = 60;
        int Erange = 80;

        for (int val : values) {
            root = insert(root, val);
        }

        System.out.println("Printing values between " + Srange + " and " + Erange + ":");
        printInRange(Srange, Erange, root);
        System.out.println();
    }
}