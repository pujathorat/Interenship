package com.java.sortedlinkedlist;


//A Linked List Node
class Node
{
 int data;
 Node next;

 Node(int data, Node next)
 {
     this.data = data;
     this.next = next;
 }

 Node(int data) {
     this.data = data;
 }
}

class SortedElementLinkedList
{
 // Helper function to print a given linked list
 public static void printList(Node head)
 {
     Node ptr = head;
     while (ptr != null)
     {
         System.out.print(ptr.data + " —> ");
         ptr = ptr.next;
     }

     System.out.println("null");
 }

 // Function to insert a given node at its correct sorted position into
 // a given list sorted in increasing order
 public static Node sortedInsert(Node head, Node newNode)
 {
     // special case for the head end
     if (head == null || head.data >= newNode.data)
     {
         newNode.next = head;
         head = newNode;
         return head;
     }

     // locate the node before the point of insertion
     Node current = head;
     while (current.next != null && current.next.data < newNode.data) {
         current = current.next;
     }

     newNode.next = current.next;
     current.next = newNode;

     return head;
 }

 public static void main(String[] args)
 {
     // input keys
     int[] keys = { 2, 3, 4, 6, 7, 8};

     // points to the head node of the linked list
     Node head = null;

     // construct a linked list
     for (int i = keys.length - 1; i >= 0; i--) {
         head = new Node(keys[i], head);
     }

     head = sortedInsert(head, new Node(5));
     head = sortedInsert(head, new Node(9));
     head = sortedInsert(head, new Node(1));

     // print linked list
     System.out.println("The modified linked list is:");
     printList(head);
 }
}