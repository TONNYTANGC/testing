package org.example;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    public Node (int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;

    // Preorder Traversal (Root → Left → Right)
    void preorder(Node node) {
        if (node==null) return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    // Inorder Traversal (Left → Root → Right)
    void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    // Postorder Traversal (Left → Right → Root)
    void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    // Method to find the height of the tree
    int height(Node node) {
        if (node == null) {
            return 0; // empty tree height = 0
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // BFS Traversal (Level Order)
    void bfs() {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) { // check no null
            Node current = queue.poll(); // remove from queue
            System.out.print(current.data + " ");

            // add left and right children to queue
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    // Check if tree is a BST
    boolean isBST() {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    // Helper function with min/max constraints
    boolean isBSTUtil(Node node, int min, int max) {
        if (node == null) {
            return true; // empty tree is BST
        }

        // Node must be within range
        if (node.data <= min || node.data >= max) {
            return false;
        }

        // Check left and right subtrees with updated constraints
        return isBSTUtil(node.left, min, node.data) &&
                isBSTUtil(node.right, node.data, max);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Create this tree:
        //        1
        //       / \
        //      2   3
        //     / \
        //    4   5
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal:");
        tree.preorder(tree.root); // 1 2 4 5 3

        System.out.println("\nInorder traversal:");
        tree.inorder(tree.root); // 4 2 5 1 3

        System.out.println("\nPostorder traversal:");
        tree.postorder(tree.root); // 4 5 2 3 1

        System.out.println("\nBFS traversal (Level Order):");
        tree.bfs();

        int height = tree.height(tree.root);
        System.out.println("\nHeight = " + height);

        System.out.println("\nBST " +  tree.isBST());
    }
}
