public class sumOfNodes {
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

        public static Node buildTree(int arr[]) {
            idx++;
            if (arr[idx] == -1) {
                return null;
            }

            Node newNode = new Node(arr[idx]);
            newNode.left = buildTree(arr);
            newNode.right = buildTree(arr);

            return newNode;
        }

        public static int sumOfNodes(Node root) {
            if (root == null) {
                return 0;
            }

            int leftsum = sumOfNodes(root.left);
            int rightsum = sumOfNodes(root.left);

            return leftsum + rightsum + root.data;
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 10, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("Sum of Nodes:" + tree.sumOfNodes(root));
    }
}
