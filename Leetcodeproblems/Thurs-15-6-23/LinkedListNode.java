package com.java.LeetcodeproblemsMayJune;

	class LinkedListNode {
	    int data;
	    LinkedListNode next;

	    public LinkedListNode(int data) {
	        this.data = data;
	        this.next = null;
	    }


	public static int findMiddleElement(LinkedListNode head) {
	    LinkedListNode slowPtr = head;  // Slow pointer
	    LinkedListNode fastPtr = head;  // Fast pointer

	    while (fastPtr != null && fastPtr.next != null) {
	        slowPtr = slowPtr.next;           // Move slow pointer by one step
	        fastPtr = fastPtr.next.next;      // Move fast pointer by two steps
	    }

	    return slowPtr.data;  // Return the value of the middle element
	}

	public static void main(String[] args) {
	    // Create the linked list
	    LinkedListNode head = new LinkedListNode(1);
	    LinkedListNode second = new LinkedListNode(3);
	    LinkedListNode third = new LinkedListNode(5);
	    LinkedListNode fourth = new LinkedListNode(7);
	    LinkedListNode fifth = new LinkedListNode(9);

	    head.next = second;
	    second.next = third;
	    third.next = fourth;
	    fourth.next = fifth;

	    // Find the middle element
	    int middleElement = findMiddleElement(head);
	    System.out.println("Middle element: " + middleElement);
	}}

