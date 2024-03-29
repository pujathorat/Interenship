package com.java.heightofBinarytree;

//Java program to calculate width of binary tree

/* A binary tree node has data, pointer to left child
and a pointer to right child */
class Node {
 int data;
 Node left, right;

 Node(int item)
 {
     data = item;
     left = right = null;
 }
}

class MaxwidthBT{
 Node root;

 /* Function to get the maximum width of a binary tree*/
 int getMaxWidth(Node node)
 {
     int maxWidth = 0;
     int width;
     int h = height(node);
     int i;

     /* Get width of each level and compare
        the width with maximum width so far */
     for (i = 1; i <= h; i++) {
         width = getWidth(node, i);
         if (width > maxWidth)
             maxWidth = width;
     }

     return maxWidth;
 }

 /* Get width of a given level */
 int getWidth(Node node, int level)
 {
     if (node == null)
         return 0;

     if (level == 1)
         return 1;
     else if (level > 1)
         return getWidth(node.left, level - 1)
             + getWidth(node.right, level - 1);
     return 0;
 }

 /* UTILITY FUNCTIONS */

 /* Compute the "height" of a tree -- the number of
  nodes along the longest path from the root node
  down to the farthest leaf node.*/
 int height(Node node)
 {
     if (node == null)
         return 0;
     else {
         /* compute the height of each subtree */
         int lHeight = height(node.left);
         int rHeight = height(node.right);

         /* use the larger one */
         return (lHeight > rHeight) ? (lHeight + 1)
                                    : (rHeight + 1);
     }
 }

 /* Driver code */
 public static void main(String args[])
 {
     MaxwidthBT tree = new MaxwidthBT();

     /*
     Constructed binary tree is:
           1
         /  \
        3    2
      /  \    \
     5   3     9
             
      */
     tree.root = new Node(1);
     tree.root.left = new Node(3);
     tree.root.right = new Node(2);
     tree.root.left.left = new Node(5);
     tree.root.left.right = new Node(3);
     tree.root.right.left= new Node(0);
     tree.root.right.right = new Node(9);
     

     // Function call
     System.out.println("Maximum width is "
                        + tree.getMaxWidth(tree.root));
 }
}
