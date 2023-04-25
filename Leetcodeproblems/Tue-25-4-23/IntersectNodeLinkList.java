package com.java.Leetcodeproblems;

public class IntersectNodeLinkList {
	// Java implementation to find intersection point of Linked list
	static class Node
	{
	 
	    int data;
	    Node next;
	};
	 
	// Function to return the intersection point
	// of the two linked lists head1 and head2
	static int getIntesectionNode(Node head1, Node head2)
	{
	    Node current1 = head1;
	    Node current2 = head2;
	 
	    // If one of the head is null
	    if (current1 == null || current2 == null )
	        return -1;
	 
	    // Continue until we find intersection node
	    while (current1 != null && current2 != null
	        && current1 != current2)
	    {
	        current1 = current1.next;
	        current2 = current2.next;
	 
	        // If we get intersection node
	        if (current1 == current2)
	            return current1.data;
	 
	        // If one of them reaches end
	        if (current1 == null )
	            current1 = head2;
	        if (current2 == null )
	            current2 = head1;
	    }
	 
	    return current1.data;
	}
	 
	// Driver code
	public static void main(String[] args)
	{
	    /*
	        Create two linked lists
	     
	        1st 1.9.1.2.4
	        2nd 3.2.4
	     
	        2 is the intersection point
	    */
	 
	    Node newNode;
	 
	    // Addition of new nodes
	    Node head1 = new Node();
	    head1.data = 3;
	 
	    Node head2 = new Node();
	    head2.data = 1;
	 
	    newNode = new Node();
	    newNode.data = 9;
	    head2.next = newNode;
	 
	    newNode = new Node();
	    newNode.data = 1;
	    head2.next.next = newNode;
	 
	    newNode = new Node();
	    newNode.data = 2;
	    head1.next = newNode;
	    head2.next.next.next = newNode;
	 
	    newNode = new Node();
	    newNode.data = 4;
	    head1.next.next = newNode;
	 
	    head1.next.next.next = null;
	    System.out.println("Intersection node of both Linked List is:");
	    System.out.print(getIntesectionNode(head1, head2));
	}
	}