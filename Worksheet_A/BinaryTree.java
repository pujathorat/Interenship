package com.java.heightofBinarytree;

/*Defining a class to store a node of the binary tree.*/
class Node {
    int data;
    Node left, right;
    /* The constructor will add nodes to the binary tree. Its left and the right
      pointer will initially point to NULL as there is no child currently */
    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTree {
    // creating reference of the Node class.
    Node root;

    /*
    A recursive function that finds the height of the binary tree 
    by maximum height between the left and right subtree. */
    int findHeight(Node node) {

        // Base case: If the tree is empty, return -1 as we cannot find its height.

        if (node == null)
            return 0;

        else {
            /* Call the findHeight() function for the left and right sub tree and store the results.
            */
            int leftHeight = findHeight(node.left);
            int rightHeight = findHeight(node.right);

            // returning the (maximum + 1) as the height of the binary tree.
            if (leftHeight > rightHeight)
                return (leftHeight + 1);
            else
                return (rightHeight + 1);
        }
    }

    public static void main(String[] args) {

        // creating object of the BinaryTree class.
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left=new Node(9);
        tree.root.right.right=new Node(10);
        tree.root.right.right.left=new Node(20);

        System.out.println("The height of binary tree is: " +
                tree.findHeight(tree.root));
    }
}