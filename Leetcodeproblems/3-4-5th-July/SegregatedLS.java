package com.java.LeetcodeproblemsJuly;


	class LinkedListNode {
	    int data;
	    LinkedListNode next;

	    LinkedListNode(int value) {
	        this.data = value;
	        this.next = null;
	    }
	}

	public class SegregatedLS {
	    public static LinkedListNode segregate(int[] arr) {
	        LinkedListNode head = null;
	        LinkedListNode tail = null;

	        for (int value : arr) {
	            LinkedListNode newNode = new LinkedListNode(value);

	            if (head == null) {
	                head = newNode;
	                tail = newNode;
	            } else {
	                tail.next = newNode;
	                tail = newNode;
	            }
	        }

	        LinkedListNode zeroHead = null;
	        LinkedListNode zeroTail = null;
	        LinkedListNode oneHead = null;
	        LinkedListNode oneTail = null;
	        LinkedListNode twoHead = null;
	        LinkedListNode twoTail = null;

	        LinkedListNode curr = head;
	        while (curr != null) {
	            if (curr.data == 0) {
	                if (zeroHead == null) {
	                    zeroHead = curr;
	                    zeroTail = curr;
	                } else {
	                    zeroTail.next = curr;
	                    zeroTail = curr;
	                }
	            } else if (curr.data == 1) {
	                if (oneHead == null) {
	                    oneHead = curr;
	                    oneTail = curr;
	                } else {
	                    oneTail.next = curr;
	                    oneTail = curr;
	                }
	            } else {
	                if (twoHead == null) {
	                    twoHead = curr;
	                    twoTail = curr;
	                } else {
	                    twoTail.next = curr;
	                    twoTail = curr;
	                }
	            }

	            curr = curr.next;
	        }

	        if (zeroHead != null) {
	            head = zeroHead;
	            if (oneHead != null) {
	                zeroTail.next = oneHead;
	                if (twoHead != null) {
	                    oneTail.next = twoHead;
	                    twoTail.next = null;
	                } else {
	                    oneTail.next = null;
	                }
	            } else if (twoHead != null) {
	                zeroTail.next = twoHead;
	                twoTail.next = null;
	            } else {
	                zeroTail.next = null;
	            }
	        } else if (oneHead != null) {
	            head = oneHead;
	            if (twoHead != null) {
	                oneTail.next = twoHead;
	                twoTail.next = null;
	            } else {
	                oneTail.next = null;
	            }
	        } else if (twoHead != null) {
	            head = twoHead;
	            twoTail.next = null;
	        }

	        return head;
	    }

	    public static void printLinkedList(LinkedListNode head) {
	        while (head != null) {
	            System.out.print(head.data + " ");
	            head = head.next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 2, 1, 2, 0, 2, 2};
	        LinkedListNode segregatedList = segregate(arr);
	        printLinkedList(segregatedList);
	    }
	}

