package com.java.LeetcodeproblemsMayJune;

public class CountNodesofLS {
	    Node head; // Represents the head (start) of the linked list

	    // Node class representing individual nodes in the linked list
	    class Node {
	        int data; // Data stored in the node
	        Node next; // Reference to the next node in the list

	        // Constructor to create a new node with the given data
	        Node(int data) {
	            this.data = data;
	            next = null;
	        }
	    }

	    // Method to count the nodes in the linked list
	    public int countNodes() {
	        int count = 0; // Variable to keep track of the node count
	        Node current = head; // Start from the head of the linked list

	        // Traverse the linked list until we reach the end (i.e., current becomes null)
	        while (current != null) {
	            count++; // Increment the count for each node encountered
	            current = current.next; // Move to the next node
	        }

	        return count; // Return the total count of nodes in the linked list
	    }

	    // Main method to test the linked list implementation
	    public static void main(String[] args) {
	    	CountNodesofLS list = new CountNodesofLS(); // Create a new instance of the linked list

	        // Adding nodes to the linked list
	        list.head = list.new Node(1);
	        Node second = list.new Node(2);
	        Node third = list.new Node(3);

	        list.head.next = second; // Link the head node to the second node
	        second.next = third; // Link the second node to the third node

	        int nodeCount = list.countNodes(); // Count the nodes in the linked list
	        System.out.println("Total number of nodes: " + nodeCount);
	    }
	}

