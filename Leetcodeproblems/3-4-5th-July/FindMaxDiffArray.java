package com.java.LeetcodeproblemsJuly;


	import java.util.*;

	public class FindMaxDiffArray {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt(); // number of test cases

	        while (t-- > 0) {
	            int n = sc.nextInt(); // size of the array
	            int[] arr = new int[n];
	            for (int i = 0; i < n; i++) {
	                arr[i] = sc.nextInt();
	            }
	            int[] LS = new int[n]; // stores the left smaller elements
	            int[] RS = new int[n]; // stores the right smaller elements

	            Stack<Integer> stack = new Stack<>();
	            // calculate the left smaller elements
	            for (int i = 0; i < n; i++) {
	                while (!stack.isEmpty() && stack.peek() >= arr[i]) {
	                    stack.pop();
	                }
	                if (stack.isEmpty()) {
	                    LS[i] = 0;
	                } else {
	                    LS[i] = stack.peek();
	                }
	                stack.push(arr[i]);
	            }

	            stack.clear(); // clear the stack for calculating the right smaller elements

	            // calculate the right smaller elements
	            for (int i = n - 1; i >= 0; i--) {
	                while (!stack.isEmpty() && stack.peek() >= arr[i]) {
	                    stack.pop();
	                }
	                if (stack.isEmpty()) {
	                    RS[i] = 0;
	                } else {
	                    RS[i] = stack.peek();
	                }
	                stack.push(arr[i]);
	            }

	            int maxDiff = Integer.MIN_VALUE;

	            // calculate the maximum absolute difference
	            for (int i = 0; i < n; i++) {
	                int diff = Math.abs(LS[i] - RS[i]);
	                maxDiff = Math.max(maxDiff, diff);
	            }

	            System.out.println(maxDiff);
	        }
	    }
	}

