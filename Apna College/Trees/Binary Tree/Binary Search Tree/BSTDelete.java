public class BSTDelete {
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

    public static Node DeleteN(int val, Node root) {
        if (root == null) {
            return null;
        }

        if (root.data > val) {
            root.left = DeleteN(val, root.left);
        } else if (root.data < val) {
            root.right = DeleteN(val, root.right);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            }
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            Node iS = inOrderSucessor(root.right);
            root.data = iS.data;
            root.right = DeleteN(iS.data, root.right);
        }
        return root;
    }

    public static Node inOrderSucessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void printStructure(Node root, int level) {
        if (root == null)
            return;

        // Print Right Subtree first (top of output)
        printStructure(root.right, level + 1);

        // Print current Node with indentation
        // 4 spaces per level for depth
        if (level != 0) {
            for (int i = 0; i < level - 1; i++)
                System.out.print("|\t"); // Vertical bars for tree trunk
            System.out.println("|-------" + root.data);
        } else {
            System.out.println(root.data); // Root has no indentation
        }

        // Print Left Subtree (bottom of output)
        printStructure(root.left, level + 1);
    }

    public static void main(String[] args) {
        int[] values = { 50, 30, 70, 20, 40, 60, 80 };
        Node root = null;

        // Build the tree
        for (int val : values) {
            root = insert(root, val);
        }

        System.out.println("=== 1. Visual Structure (Look Sideways) ===");
        printStructure(root, 0);

        root = DeleteN(50, root);

        System.out.println("\n=== After Deletion ===");
        printStructure(root, 0);
        System.out.println();
    }
}