package com.java.LeetcodeproblemsMayJune;


	// Java program to check if binary tree is subtree of
	// another binary tree
	 
	// A binary tree node
	class Node {
	    int data;
	    Node left, right, nextRight;
	 
	    Node(int item)
	    {
	        data = item;
	        left = right = nextRight = null;
	    }
	}
	 
	public class SubtreeBT {
	    Node root1, root2;
	 
	    /* A utility function to check whether trees with roots
	       as root1 and root2 are identical or not */
	    boolean areIdentical(Node root1, Node root2)
	    {
	 
	        /* base cases */
	        if (root1 == null && root2 == null)
	            return true;
	 
	        if (root1 == null || root2 == null)
	            return false;
	 
	        /* Check if the data of both roots is same and data
	           of left and right subtrees are also same */
	        return (root1.data == root2.data
	                && areIdentical(root1.left, root2.left)
	                && areIdentical(root1.right, root2.right));
	    }
	 
	    /* This function returns true if S is a subtree of T,
	     * otherwise false */
	    boolean isSubtree(Node T, Node S)
	    {
	        /* base cases */
	        if (S == null)
	            return true;
	 
	        if (T == null)
	            return false;
	 
	        /* Check the tree with root as current node */
	        if (areIdentical(T, S))
	            return true;
	 
	        /* If the tree with root as current node doesn't
	           match then
	           try left and right subtrees one by one */
	        return isSubtree(T.left, S)
	            || isSubtree(T.right, S);
	    }
	 
	    public static void main(String args[])
	    {
	    	SubtreeBT tree = new SubtreeBT();
	 
	        // TREE 1
	        //Construct the tree
	             
	 
	        tree.root1 = new Node(26);
	        tree.root1.right = new Node(3);
	        tree.root1.right.right = new Node(3);
	        tree.root1.left = new Node(10);
	        tree.root1.left.left = new Node(4);
	        tree.root1.left.left.right = new Node(30);
	        tree.root1.left.right = new Node(6);
	 
	        // TREE 2
	        // Construct the tree
	     
	 
	        tree.root2 = new Node(10);
	        tree.root2.right = new Node(6);
	        tree.root2.left = new Node(4);
	        tree.root2.left.right = new Node(30);
	 
	        if (tree.isSubtree(tree.root1, tree.root2))
	            System.out.println(
	                "true. Tree 2 is subtree of Tree 1 ");
	        else
	            System.out.println(
	                "false. Tree 2 is not a subtree of Tree 1");
	    }
	}
