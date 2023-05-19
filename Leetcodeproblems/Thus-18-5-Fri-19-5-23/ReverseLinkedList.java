package com.java.LeetcodeproblemsMayJune;
	// Recursive Java program to reverse
	// a linked list
	 
	import java.io.*; 
	
	public class ReverseLinkedList {
	    static Node head; // head of list
	 
	    static class Node {
	        int data;
	        Node next;
	        Node(int d)
	        {
	            data = d;
	            next = null;
	        }
	    }
	 
	    static Node reverse(Node head)
	    {
	        if (head == null || head.next == null)
	            return head;
	 
	        /* reverse the rest list and put
	        the first element at the end */
	       
	        Node rest = reverse(head.next);
	        head.next.next = head;
	        head.next = null;
	 
	        /* fix the head pointer */
	        return rest;
	    }
	 
	    /* Function to print linked list */
	    static void print()
	    {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	 
	    static void push(int data)
	    {
	        Node temp = new Node(data);
	        temp.next = head;
	        head = temp;
	    }
	 
	    /* Driver program to test above function*/
	    public static void main(String args[])
	    {
	        /* Start with the empty list */
	 
	        push(60);
	        push(8);
	        push(25);
	        push(47);
	 
	        System.out.println("Given linked list");
	        print();
	 
	        head = reverse(head);
	 
	        System.out.println("Reversed linked list");
	        print();
	    }
	}
