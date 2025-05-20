import java.util.*;

class BasicTree {

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(3);
        node.right = new Node(2);
        node.left.left = new Node(6);
        node.left.right = new Node(7);
        node.right.left = new Node(4);
        node.right.right = new Node(5);

        System.out.println("Pre-Order Traversal:");
        preOrderTraversal(node);
        System.out.println();

        System.out.println("In-Order Traversal:");
        inOrderTraversal(node);
        System.out.println();

        System.out.println("Post-Order Traversal:");
        postOrderTraversal(node);
        System.out.println();

        System.out.println("Level-Order Traversal:");
        levelOrderTraversal(node);
    }

    static void levelOrderTraversal(Node node) {
        if (node == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");
            if (current.left != null) queue.offer(current.left);
            if (current.right != null) queue.offer(current.right);
        }
    }

    static void preOrderTraversal(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    static void inOrderTraversal(Node node) {
        if (node == null) return;
        inOrderTraversal(node.left);
        System.out.print(node.data + " ");
        inOrderTraversal(node.right);
    }

    static void postOrderTraversal(Node node) {
        if (node == null) return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data + " ");
    }
}

class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
    }
}
