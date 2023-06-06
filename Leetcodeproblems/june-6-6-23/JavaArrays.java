package com.java.LeetcodeproblemsMayJune;

public class JavaArrays {
	// Java program to demonstrate
     //array of integers
	    // Driver method
	    public static void main(String args[])
	    {
	    	int n=5;
	        int arr[] = { 4, 3, 6, 5, 7};
	 
	        // passing array 
	        sum(arr);
	    }
	 
	    public static void sum(int[] arr)
	    {
	    	 // accessing the array elements
	    	System.out.println("Array of integers:");
	        for (int i = 0; i < arr.length; i++)
	            System.out.print(arr[i]);
	        // getting sum of array values
	        int sum = 0;
	        int avg=0;
	 
	        for (int i = 0; i < arr.length; i++)
	            sum += arr[i];
	            avg= sum/5;
	        System.out.println("\n sum of array values : " + sum);
	        System.out.println("average of array values: " + avg);
	    }
	}
