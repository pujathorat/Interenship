package com.java.LeetcodeproblemsMayJune;
	// Java program to print all the node to leaf path
	  
	/* A binary tree node has data, pointer to left child
	   and a pointer to right child */
	class Node
	{
	    int data;
	    Node left, right;
	  
	    Node(int item)
	    {
	        data = item;
	        left = right = null;
	    }
	}
	  
	public class RoottoLeaf {
	
	    Node root;
	      
	    /*Given a RoottoLeaf, print out all of its root-to-leaf
	      paths, one per line. Uses a recursive helper to do
	      the work.*/
	    void printPaths(Node node)
	    {
	        int path[] = new int[1000];
	        printPathsRecur(node, path, 0);
	    }
	  
	    /* Recursive helper function -- given a node, and an array
	       containing the path from the root node up to but not
	       including this node, print out all the root-leaf paths.*/
	    void printPathsRecur(Node node, int path[], int pathLen)
	    {
	        if (node == null)
	            return;
	  
	        /* append this node to the path array */
	        path[pathLen] = node.data;
	        pathLen++;
	  
	        /* it's a leaf, so print the path that lead to here  */
	        if (node.left == null && node.right == null)
	            printArray(path, pathLen);
	        else
	        {
	            /* otherwise try both subtrees */
	            printPathsRecur(node.left, path, pathLen);
	            printPathsRecur(node.right, path, pathLen);
	        }
	    }
	  
	    /* Utility function that prints out an array on a line. */
	    void printArray(int ints[], int len)
	    {
	        int i;
	        for (i = 0; i < len; i++)
	        {
	            System.out.print(ints[i] + " ");
	        }
	        System.out.println("");
	    }
	  
	    // driver program to test above functions
	    public static void main(String args[])
	    {
	    	RoottoLeaf tree = new RoottoLeaf();
	        tree.root = new Node(20);
	        tree.root.left = new Node(18);
	        tree.root.right = new Node(12);
	        tree.root.left.left = new Node(13);
	        tree.root.left.right = new Node(15);
	        tree.root.right.left = new Node(14);
	         
	        /* Let us test the built tree by printing Inorder traversal */
	        tree.printPaths(tree.root);
	    }
	}
	 
