import java.util.LinkedList;
import java.util.Queue;

public class heightOfTree {
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

        public static int heightOfTree(Node root) {
            if (root == null) {
                return 0;
            }

            int leftHeight = heightOfTree(root.left);
            int rightHeight = heightOfTree(root.right);

            int treeHeight = Math.max(leftHeight, rightHeight) + 1;

            return treeHeight;
        }

        public static void heightOfTree_2(Node root) {
            if (root == null) {
                return;
            }
            int count = 1;
            Queue q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currNode = (Node) q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        count++;
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }

                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
            System.out.println("Height of tree is:" + count);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 10, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("Height of the Tree is:" + tree.heightOfTree(root));
        tree.heightOfTree_2(root);
    }
}