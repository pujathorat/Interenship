package com.java.LeetcodeproblemsJuly;

	// Java program to count number of occurrences of
	// each element in the array 

	import java.io.*;
	import java.util.*;
	public class NumFrequency {
	    public static void findFrequencies(int[] ele, int n)
	    {
	        int freq = 1;
	        int idx = 1;
	        int element = ele[0];
	        while (idx < n) {
	            // check if the current element is equal to
	            // previous element.
	            if (ele[idx - 1] == ele[idx]) {
	                freq++;
	                idx++;
	            }
	            else {
	                System.out.println(element + " " + freq);
	                element = ele[idx];
	                idx++;

	                // reset the frequency
	                freq = 1;
	            }
	        }

	        // print the last element and its frequency
	        System.out.println(element + " " + freq);
	    }

	    // Driver code
	    public static void main(String[] args)
	    {

	        System.out.println(
	            "---frequencies in a sorted array----");
	        int[] arr = { 10, 20, 30, 30, 30, 40,
	                      50, 50, 50, 50, 70 };
	        int n = arr.length;

	        // Function call
	        findFrequencies(arr, n);
	    }
	}

