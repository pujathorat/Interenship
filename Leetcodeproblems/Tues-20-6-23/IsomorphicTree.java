package com.java.LeetcodeproblemsMayJune;


	// Node class to represent a node in the tree
	class Node {
	    int data;
	    Node left, right;

	    // Constructor
	    Node(int item) {
	        data = item;
	        left = right = null;
	    }
	}

	// TreeIsomorphismChecker class to check if trees are isomorphic
	public class IsomorphicTree {
	    Node root1, root2;

	    // Constructor
	    IsomorphicTree() {
	        root1 = root2 = null;
	    }

	    // Function to check if two trees are isomorphic
	    boolean isIsomorphic(Node n1, Node n2) {
	        // If both trees are empty, they are isomorphic
	        if (n1 == null && n2 == null)
	            return true;

	        // If one of the trees is empty, they are not isomorphic
	        if (n1 == null || n2 == null)
	            return false;

	        // If the data of the nodes is different, they are not isomorphic
	        if (n1.data != n2.data)
	            return false;

	        // Check for isomorphism recursively
	        // Case 1: The subtrees are not flipped
	        boolean case1 = isIsomorphic(n1.left, n2.left) && isIsomorphic(n1.right, n2.right);
	        // Case 2: The subtrees are flipped
	        boolean case2 = isIsomorphic(n1.left, n2.right) && isIsomorphic(n1.right, n2.left);

	        // Return true if either case is true
	        return case1 || case2;
	    }

	    // Main method to test the program
	    public static void main(String[] args) {
	    	IsomorphicTree tree = new IsomorphicTree();
	  
	        // Construct the first tree
	        tree.root1 = new Node(1);
	        tree.root1.left = new Node(2);
	        tree.root1.right = new Node(3);
	        tree.root1.left.left = new Node(4);
	        tree.root1.left.right = new Node(5);
	  
	        // Construct the second tree
	        tree.root2 = new Node(1);
	        tree.root2.left = new Node(3);
	        tree.root2.right = new Node(2);
	        tree.root2.right.left = new Node(5);
	        tree.root2.right.right = new Node(4);

	        // Check if the trees are isomorphic and print the result
	        if (tree.isIsomorphic(tree.root1, tree.root2))
	            System.out.println("The trees are isomorphic.");
	        else
	            System.out.println("The trees are not isomorphic.");
	    }
	}

