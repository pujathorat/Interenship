package com.java.LeetcodeproblemsMayJune;

public class StringfromBT {
	// Java program to construct string from binary tree
	static class Node
	{
	    int data;
	    Node left, right;
	};
	static String str;
	 
	/* Helper function that allocates a new node */
	static Node newNode(int data)
	{
	    Node node = new Node();
	    node.data = data;
	    node.left = node.right = null;
	    return (node);
	}
	 
	// Function to construct string from binary tree
	static void treeToString(Node root)
	{
	    // bases case
	    if (root == null)
	        return;
	 
	    // push the root data as character
	    str += (Character.valueOf((char)
	           (root.data + '0')));
	 
	    // if leaf node, then return
	    if (root.left == null && root.right == null)
	        return;
	 
	    // for left subtree
	    str += ('(');
	    treeToString(root.left);
	    str += (')');
	 
	    // only if right child is present to
	    // avoid extra parenthesis
	    if (root.right != null)
	    {
	        str += ('(');
	        treeToString(root.right);
	        str += (')');
	    }
	}
	 
	// Driver Code
	public static void main(String[] args)
	{
	     
	    /* Let us construct below tree
	             1
	            / \
	           4   5
	         / \    \
	        6   7   8 */
	    Node root = newNode(1);
	    root.left = newNode(4);
	    root.right = newNode(5);
	    root.left.left = newNode(6);
	    root.left.right = newNode(7);
	    root.right.right = newNode(8);
	    str = "";
	    treeToString(root);
	    System.out.println(str);
	}
	}
