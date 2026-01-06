import java.util.ArrayList;

public class PathToLeaf {
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
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // 1. This is the main function users call.
    // It creates the ONE list we will use.
    public static void leafPath(Node root) {
        ArrayList<Integer> path = new ArrayList<>();
        helper(root, path);
    }

    // 2. This is the recursive worker that passes the list around.
    public static void helper(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        // Add current node to the shared list
        path.add(root.data);

        // Check for leaf
        if (root.left == null && root.right == null) {
            // Print the path nicely
            printPath(path);
        } else {
            // Pass the SAME list down
            helper(root.left, path);
            helper(root.right, path);
        }

        // Backtrack: Remove the last node so the parent is clean for the next child
        path.remove(path.size() - 1);
    }

    // Just a helper to print the list nicely
    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        leafPath(root);
    }
}