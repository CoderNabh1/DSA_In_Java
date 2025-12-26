public class DiameterOfTree {
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

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static int heightOfTree(Node root) {
            if (root == null) {
                return 0;
            }

            int leftheight = heightOfTree(root.left);
            int rightheight = heightOfTree(root.right);
            int treeHeight = Math.max(leftheight, rightheight) + 1;

            return treeHeight;
        }

        public static int diameter(Node root) {
            if (root == null) {
                return 0;
            }

            int left = diameter(root.left);
            int right = diameter(root.right);
            int leftrightheight = heightOfTree(root.left) + heightOfTree(root.right) + 1;

            return Math.max(leftrightheight, Math.max(left, right));
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 10, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("Diameter of Tree is:" + tree.diameter(root));
    }
}
