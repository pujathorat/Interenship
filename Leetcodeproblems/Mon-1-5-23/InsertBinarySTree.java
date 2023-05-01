package com.java.Leetcodeproblems;

//Java program to demonstrate
//insert operation in binary
//search tree

import java.io.*;

public class InsertBinarySTree {
 // Class containing left
 // and right child of current node
 // and key value
 class Node {
     int key;
     Node left, right;

     public Node(int item)
     {
         key = item;
         left = right = null;
     }
 }

 // Root of BST
 Node root;

 // Constructor
 InsertBinarySTree() { root = null; }

 InsertBinarySTree(int value) { root = new Node(value); }

 // This method mainly calls insertRec()
 void insert(int key) { root = insertRec(root, key); }

 // A recursive function to
 // insert a new key in BST
 Node insertRec(Node root, int key)
 {
     // If the tree is empty,
     // return a new node
     if (root == null) {
         root = new Node(key);
         return root;
     }

     // Otherwise, recur down the tree
     else if (key < root.key)
         root.left = insertRec(root.left, key);
     else if (key > root.key)
         root.right = insertRec(root.right, key);

     // Return the (unchanged) node pointer
     return root;
 }

 // This method mainly calls InorderRec()
 void inorder() { inorderRec(root); }

 // A utility function to
 // do inorder traversal of BST
 void inorderRec(Node root)
 {
     if (root != null) {
         inorderRec(root.left);
         System.out.print(root.key + " ");
         inorderRec(root.right);
     }
 }

 // Driver Code
 public static void main(String[] args)
 {
	 InsertBinarySTree tree = new InsertBinarySTree();

     /* Let us create following BST
           60
        /     \
       33      78
      /  \    /  \
    19   44  65   90 */
     tree.insert(60);
     tree.insert(33);
     tree.insert(19);
     tree.insert(44);
     tree.insert(78);
     tree.insert(65);
     tree.insert(90);

     // Print inorder traversal of the BST
     tree.inorder();
 }
}
