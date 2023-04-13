package com.java.WorksheetB;
// Java Program to Merge Two Sorted
// Linked Lists in New List
// Recursively
 
import java.io.*;
 
public class ListNode {
 
    int val;
    ListNode next;
 
    ListNode() {}
    ListNode(int val) { this.val = val; }
 
    ListNode(int val, ListNode next)
    {
        this.val = val;
        this.next = next;
    }
}
 
class MLS {
 
    public static ListNode mergeTwoLists(ListNode l1,
                                         ListNode l2)
    {
 
        // New List
        ListNode result = null;
 
        // If anyone list is empty then returns the
        // remaining elements of other list
        if (l1 == null) {
            return l2;
        }
        else if (l2 == null) {
            return l1;
        }
 
        // Find the smaller element and recursively call the
        // function with next node
        if (l1.val <= l2.val) {
            result = l1;
            result.next = mergeTwoLists(l1.next, l2);
        }
        else {
            result = l2;
            result.next = mergeTwoLists(l1, l2.next);
        }
 
        // Return the resultant list
        return (result);
    }
    // A utility function to print linked list
    static void printList(ListNode node)
    {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }
 
    // Driver code
    public static void main(String[] args)
    {
        ListNode head1 = new ListNode(23);
        head1.next = new ListNode(35);
        head1.next.next = new ListNode(65);
 
        // 23->35->65 LinkedList created
        ListNode head2 = new ListNode(43);
        head2.next = new ListNode(59);
        head2.next.next = new ListNode(60);
 
        // 43->59->60 LinkedList created
        ListNode mergedhead = mergeTwoLists(head1, head2);
        System.out.println("Merged linked list is:");
        printList(mergedhead);
    }
}