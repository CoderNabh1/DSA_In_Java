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

    static class binaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;

            if (nodes[idx] == 1 || idx >= nodes.length) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static int LevelOrder(Node root, int k) {
            if (root == null) {
                return 0;
            }
            if (k == 0 || k == 1) {
                return root.data;
            }
            Queue q = new LinkedList<>();
            q.add(root);
            q.add(null);
            if (q.isEmpty()) {

            }
        }
    }

}
