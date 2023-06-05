package com.java.LeetcodeproblemsMayJune;

	import java.util.LinkedList;
	import java.util.Queue;
	 
	public class AddLevelNodeBT {
	    static class TreeNode {
	        int val;
	        TreeNode left;
	        TreeNode right;
	 
	        // Constructor
	        TreeNode(int v)
	        {
	            val = v;
	            left = right = null;
	        }
	    }
	 
	    // Function to add one row to a
	    // binary tree
	    public static TreeNode addOneRow(TreeNode root, int val,
	                                     int depth)
	    {
	        Queue<TreeNode> q = new LinkedList<>();
	        if (depth == 1) {
	            TreeNode rt = new TreeNode(val);
	            rt.left = root;
	            return rt;
	        }
	        int c = 1;
	        q.offer(root);
	        while (!q.isEmpty() && c < depth) {
	            int a = q.size();
	            c++;
	            for (int i = 0; i < a; i++) {
	                TreeNode k = q.poll();
	                if (c == depth) {
	                    if (k.left != null) {
	                        TreeNode tm = new TreeNode(val);
	                        TreeNode t = k.left;
	                        k.left = tm;
	                        tm.left = t;
	                    }
	                    else {
	                        TreeNode tm = new TreeNode(val);
	                        k.left = tm;
	                    }
	 
	                    if (k.right != null) {
	                        TreeNode tm = new TreeNode(val);
	                        TreeNode t = k.right;
	                        k.right = tm;
	                        tm.right = t;
	                    }
	                    else {
	                        TreeNode tm = new TreeNode(val);
	                        k.right = tm;
	                    }
	                }
	                else {
	                    if (k.left != null)
	                        q.offer(k.left);
	                    if (k.right != null)
	                        q.offer(k.right);
	                }
	            }
	        }
	        return root;
	    }
	 
	    // Function to print the tree in
	    // the level order traversal
	    public static void levelOrder(TreeNode root)
	    {
	        Queue<TreeNode> Q = new LinkedList<>();
	 
	        if (root == null) {
	            System.out.println("Null");
	            return;
	        }
	 
	        // Add root node to Q
	        Q.offer(root);
	 
	        while (Q.size() > 0) {
	            // Stores the total nodes
	            // at current level
	            int len = Q.size();
	 
	            // Iterate while len
	            // is greater than 0
	            while (len > 0) {
	                // Stores the front Node
	                TreeNode temp = Q.poll();
	 
	                // Print the value of
	                // the current node
	                System.out.print(temp.val + " ");
	 
	                // If reference to left
	                // subtree is not NULL
	                if (temp.left != null)
	 
	                    // Add root of left
	                    // subtree to Q
	                    Q.offer(temp.left);
	 
	                // If reference to right
	                // subtree is not NULL
	                if (temp.right != null)
	 
	                    // Add root of right
	                    // subtree to Q
	                    Q.offer(temp.right);
	 
	                // Decrement len by 1
	                len--;
	            }
	 
	            System.out.println();
	        }
	    }
	 
	    // Driver Code
	    public static void main(String[] args)
	    {
	        // Given Tree
	        TreeNode root = new TreeNode(1);
	        root.left = new TreeNode(3);
	        root.left.left = new TreeNode(5);
	        root.left.right = new TreeNode(6);
	        root.right = new TreeNode(4);
	        root.right.right = new TreeNode(8);
	 
	        int L = 2;
	        int K = 1;
	 
	        levelOrder(addOneRow(root, K, L));
	    }
	}
