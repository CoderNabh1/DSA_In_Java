public class minValue {
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
    }

    public static int findMinValue(Node root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        int leftMin = findMinValue(root.left);
        int rightMin = findMinValue(root.right);

        return Math.min(root.data, Math.min(leftMin, rightMin));
    }

    public static void main(String[] args) {
        binaryTree tree = new binaryTree();
        int nodes[] = { 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        Node root = tree.buildTree(nodes);
        System.out.println(findMinValue(root));
    }
}
