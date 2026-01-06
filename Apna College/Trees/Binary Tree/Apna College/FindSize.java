public class FindSize {
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

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int node[]) {
            idx++;

            if (idx >= node.length || node[idx] == -1) {
                return null;
            }

            Node newNode = new Node(node[idx]);
            newNode.left = buildTree(node);
            newNode.right = buildTree(node);

            return newNode;
        }

        public static int findSize(Node root) {
            if (root == null) {
                return 0;
            }

            return findSize(root.left) + findSize(root.right) + 1;
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int nodes[] = { 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        Node root = tree.buildTree(nodes);
        System.out.println(tree.findSize(root));

    }
}
