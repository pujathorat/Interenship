package com.java.LeetcodeproblemsMayJune;

public class PrunningBT {
		static class TreeNode {
		    int data;
		    TreeNode left;
		    TreeNode right;
		    TreeNode(int val)
		    {
		        data = val;
		        left = null;
		        right = null;
		    }
		};
		 
		// Inorder function to print the tree
		static void inorderPrint(TreeNode root)
		{
		    if (root == null)
		        return;
		    inorderPrint(root.left);
		    System.out.print(root.data+ " ");
		    inorderPrint(root.right);
		}
		 
		// Postorder traversal
		static TreeNode TrimTree(TreeNode root)
		{
		    if (root==null)
		        return null;
		 
		    // Traverse from leaf to node
		    root.left = TrimTree(root.left);
		    root.right = TrimTree(root.right);
		 
		    // We only trim if the node's value is 0
		    // and children are null
		    if (root.data == 0 && root.left == null
		        && root.right == null) {
		 
		        // We trim the subtree by returning null
		        return null;
		    }
		 
		    // Otherwise we leave the node the way it is
		    return root;
		}
		 
		// Driver code
		public static void main(String[] args)
		{
		 
		    TreeNode root = new TreeNode(1);
		    root.left = new TreeNode(0);
		    root.right = new TreeNode(1);
		    root.left.left = new TreeNode(0);
		    root.left.right = new TreeNode(0);
		    root.right.left = new TreeNode(0);
		    root.right.right = new TreeNode(1);
		 
		    TreeNode ReceivedRoot = TrimTree(root);
		    System.out.println();
		    inorderPrint(ReceivedRoot);
		}
		}
		 
