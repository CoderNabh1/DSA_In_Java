import java.util.LinkedList;
import java.util.Queue;

public class kLevelSum {

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
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static int FindLevelSum(Node root, int k) {
            if (root == null)
                return 0;

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            int level = 1;
            int sum = 0;

            while (!q.isEmpty()) {
                Node currNode = q.remove();

                if (currNode == null) {
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                        level++;
                    }
                } else {
                    if (level == k) {
                        sum += currNode.data;
                    }
                    if (currNode.left != null)
                        q.add(currNode.left);
                    if (currNode.right != null)
                        q.add(currNode.right);
                }
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 10, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        int level = 2;

        // Reset index before building (good practice if running multiple times)
        BinaryTree.idx = -1;

        Node root = BinaryTree.buildTree(nodes);
        System.out.println("Sum of Nodes at Level " + level + ": " + BinaryTree.FindLevelSum(root, level));
    }
}