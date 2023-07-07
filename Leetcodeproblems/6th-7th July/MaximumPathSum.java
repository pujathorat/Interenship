package com.java.LeetcodeproblemsJuly;

	// Definition of a binary tree node
	class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;

	    TreeNode(int val) {
	        this.val = val;
	    }
	}

	class MaximumPathSum {
	    int maxPathSum;

	    public int findMaximumPathSum(TreeNode root) {
	        maxPathSum = Integer.MIN_VALUE;
	        findMaxPathSum(root);
	        return maxPathSum;
	    }

	    private int findMaxPathSum(TreeNode node) {
	        if (node == null)
	            return 0;

	        int leftSum = Math.max(0, findMaxPathSum(node.left));
	        int rightSum = Math.max(0, findMaxPathSum(node.right));

	        // Calculate the maximum path sum passing through the current node
	        int currentPathSum = node.val + leftSum + rightSum;

	        // Update the maximum path sum
	        maxPathSum = Math.max(maxPathSum, currentPathSum);

	        // Return the maximum sum of the path from the current node
	        return node.val + Math.max(leftSum, rightSum);
	    }

	    public static void main(String[] args) {
	        // Create a sample binary tree
	        TreeNode root = new TreeNode(3);
	        root.left = new TreeNode(4);
	        root.right = new TreeNode(6);
	        root.left.left = new TreeNode(7);
	        root.left.right = new TreeNode(9);
	        root.right.left = new TreeNode(10);
	        root.right.right = new TreeNode(12);

	        // Define the two special nodes
	        TreeNode node1 = root.left.left;
	        TreeNode node2 = root.right.right;

	        MaximumPathSum pathSum = new MaximumPathSum();
	        int maxPathSum = pathSum.findMaximumPathSum(root);
	        System.out.println("Maximum Path Sum: " + maxPathSum);
	    }
	}
