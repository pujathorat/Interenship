package com.java.LeetcodeproblemsMayJune;
//Java Program for the above approach
import java.util.*;
public class UnivaluedBinaryTree {

//Structure of a tree node
static class Node
{
 int data;
 Node left;
 Node right;
};

//Function to insert a new node
//in a binary tree
static Node newNode(int data)
{
 Node temp = new Node();
 temp.data = data;
 temp.left = temp.right = null;
 return (temp);
}

//Function to check If the tree
//is uni-valued or not
static boolean isUnivalTree(Node root)
{

 // If tree is an empty tree
 if (root == null)
 {
     return true;
 }

 // If all the nodes on the left subtree
 // have not value equal to root node
 if (root.left != null
     && root.data != root.left.data)
     return false;

 // If all the nodes on the left subtree
 // have not value equal to root node
 if (root.right != null
     && root.data != root.right.data)
     return false;

 // Recurse on left and right subtree
 return isUnivalTree(root.left)
        && isUnivalTree(root.right);
}

//Driver Code
public static void main(String[] args)
{

 /*
             1
           /   \
          1     1
        /  \     \
       1    1     1
 */
 Node root = newNode(1);
 root.left = newNode(1);
 root.right = newNode(1);
 root.left.left = newNode(1);
 root.left.right = newNode(1);
 root.right.right = newNode(1);

 if (isUnivalTree(root))
 {
     System.out.print("YES");
 }
 else
 {
     System.out.print("NO");
 }
}
}