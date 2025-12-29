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
            root = new Node(val);
            return null;
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
            return DeleteN(val, root.left);
        } else if (root.data < val) {
            return DeleteN(val, root.right);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left != null || root.right != null) {
                if (root.left != null) {
                    return root.left;
                } else {
                    return root.right;
                }
            } else {
                Node iS = inOrderSuccessor(root.right);
                root.data = iS.data;
                root.right = DeleteN(iS.data, root.right);
            }
        }
        return root;
    }

    public static Node inOrderSucessor()
}