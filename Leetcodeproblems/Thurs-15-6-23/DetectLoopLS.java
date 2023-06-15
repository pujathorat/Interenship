package com.java.LeetcodeproblemsMayJune;

public class DetectLoopLS {
	    static class Node {
	        int data;
	        Node next;

	        Node(int value) {
	            data = value;
	            next = null;
	        }
	    }

	    // Function to detect a loop in the linked list
	    static boolean detectLoop(Node head) {
	        Node slow = head;  // Initialize slow pointer
	        Node fast = head;  // Initialize fast pointer

	        while (slow != null && fast != null && fast.next != null) {
	            slow = slow.next;         // Move slow pointer by one node
	            fast = fast.next.next;    // Move fast pointer by two nodes

	            // If slow and fast pointers meet, there is a loop
	            if (slow == fast)
	                return true;
	        }

	        return false;  // No loop found
	    }

	    // Main method to test the code
	    public static void main(String[] args) {
	        Node head = new Node(1);
	        Node second = new Node(6);
	        Node third = new Node(9);
	        Node fourth = new Node(11);

	        // Create a loop in the linked list
	        head.next = second;
	        second.next = third;
	        third.next = fourth;
	        fourth.next = second;  // Loop created, fourth node points to the second node

	        boolean loopExists = detectLoop(head);
	        if (loopExists)
	            System.out.println("Loop exists in the linked list.");
	        else
	            System.out.println("No loop found in the linked list.");
	    }
	}
