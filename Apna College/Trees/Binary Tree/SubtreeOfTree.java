public class SubtreeOfTree {
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

    static class binaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            // Check for array bounds to be safe, though valid arrays won't need this
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static boolean isIdentical(Node root, Node subRoot) {
            if (root == null && subRoot == null) {
                return true;
            }
            if (root == null || subRoot == null) {
                return false;
            }

            if (root.data == subRoot.data) {
                return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
            }
            return false;
        }

        public static boolean findSubtree(Node root, Node subRoot) {
            if (subRoot == null) {
                return true;
            }
            if (root == null) {
                return false;
            }

            // If data matches, check if the structures are identical
            if (root.data == subRoot.data) {
                if (isIdentical(root, subRoot)) {
                    return true;
                }
            }

            return findSubtree(root.left, subRoot) || findSubtree(root.right, subRoot);
        }
    }

    public static void main(String[] args) {
        // Corrected Preorder Arrays with -1 for nulls
        // Tree: Root=3, Left=4 (L=1, R=2), Right=5
        int btree[] = { 3, 4, 1, -1, -1, 2, -1, -1, 5, -1, -1 };

        // Subtree: Root=4, Left=1, Right=2
        int stree[] = { 4, 1, -1, -1, 2, -1, -1 };

        binaryTree tree = new binaryTree();

        // Build first tree
        Node root = tree.buildTree(btree);

        // CRITICAL FIX: Reset index before building the second tree
        binaryTree.idx = -1;

        // Build second tree
        Node subRoot = tree.buildTree(stree);

        System.out.println("Is this the Subtree: " + tree.findSubtree(root, subRoot));
    }
}