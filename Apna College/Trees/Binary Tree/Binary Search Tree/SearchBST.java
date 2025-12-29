public class SearchBST {
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

        // FIX 1: Standard BST Logic (Smaller -> Left, Larger -> Right)
        if (root.data > val) {
            // FIX 2: Assign the result back to root.left
            root.left = insert(root.left, val);
        } else {
            // FIX 2: Assign the result back to root.right
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static boolean findKey(Node root, int key) {
        // Base Case 1: We hit a dead end (Key not found)
        if (root == null) {
            return false;
        }

        // Base Case 2: We found the key!
        if (root.data == key) {
            return true;
        }

        // Recursive Step: Search Left or Right?
        if (root.data > key) {
            return findKey(root.left, key);
        } else {
            return findKey(root.right, key);
        }
    }

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        int k = 2;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        if (findKey(root, k)) {
            System.out.println("Key Found!!");
        } else {
            System.out.println("Key is not present");
        }
    }
}