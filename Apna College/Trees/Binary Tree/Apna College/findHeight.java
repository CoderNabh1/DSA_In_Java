public class findHeight {
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

            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static int findHeight(Node root) {
            if (root == null) {
                return 0;
            }

            int leftH = findHeight(root.left);
            int rightH = findHeight(root.right);
            int finalH = Math.max(leftH, rightH) + 1;

            return finalH;
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 10, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        binaryTree tree = new binaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("Height of the Tree is:" + tree.findHeight(root));
    }
}
