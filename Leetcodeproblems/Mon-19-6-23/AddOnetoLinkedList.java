package com.java.LeetcodeproblemsMayJune;

	// Node class for the linked list
	class ListNode {
	    int val;
	    ListNode next;

	    public ListNode(int val) {
	        this.val = val;
	    }
	}

	public class AddOnetoLinkedList {
	    public static ListNode addOne(ListNode head) {
	        // Reverse the linked list
	        head = reverseList(head);

	        ListNode curr = head;
	        int carry = 1;

	        while (curr != null) {
	            int sum = curr.val + carry;
	            carry = sum / 10; // Calculate the carry
	            curr.val = sum % 10; // Update the current digit
	            curr = curr.next;
	        }

	        // If there is still a carry after traversing the list
	        if (carry > 0) {
	            ListNode newDigit = new ListNode(carry);
	            curr.next = newDigit; // Add a new node with the carry as the value
	        }

	        // Reverse the list again to get the final result
	        head = reverseList(head);

	        return head;
	    }

	    private static ListNode reverseList(ListNode head) {
	        ListNode prev = null;
	        ListNode curr = head;

	        while (curr != null) {
	            ListNode nextNode = curr.next; // Store the next node
	            curr.next = prev; // Reverse the next pointer
	            prev = curr; // Move the prev pointer
	            curr = nextNode; // Move the curr pointer
	        }

	        return prev;
	    }

	    // Helper method to print the linked list
	    private static void printList(ListNode head) {
	        ListNode curr = head;
	        while (curr != null) {
	            System.out.print(curr.val + " -> ");
	            curr = curr.next;
	        }
	        System.out.println("null");
	    }

	    public static void main(String[] args) {
	        // Create the linked list: 1 -> 2 -> 3
	        ListNode head = new ListNode(1);
	        head.next = new ListNode(2);
	        head.next.next = new ListNode(3);

	        System.out.println("Original linked list:");
	        printList(head);

	        head = addOne(head);

	        System.out.println("Linked list after adding 1:");
	        printList(head);
	    }
	}

