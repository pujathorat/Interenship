package com.java.LeetcodeproblemsJuly;

import java.util.Arrays;

import java.io.*;
	 
public class BitonicPoint{
	    // Function to find bitonic point
	    // using binary search
	    static int binarySearch(int arr[], int left,
	                                       int right)
	    {
	        if (left <= right)
	        {
	            int mid = (left + right) / 2;
	     
	            // base condition to check if arr[mid]
	            // is bitonic point or not
	            if (arr[mid - 1] < arr[mid] &&
	                   arr[mid] > arr[mid + 1])
	                   return mid;
	     
	            // We assume that sequence is bitonic. We go to
	            // right subarray if middle point is part of
	            // increasing subsequence. Else we go to left
	            // subarray.
	            if (arr[mid] < arr[mid + 1])
	                return binarySearch(arr, mid + 1, right);
	            else
	                return binarySearch(arr, left, mid - 1);
	        }
	     
	        return -1;
	    }
	     
	    // Driver program
	    public static void main (String[] args)
	    {
	        int arr[] = {6, 7, 8, 11, 9, 5, 2, 1};
	        int n = arr.length;
	        int index = binarySearch(arr, 1, n - 2);
	        if (index != -1)
	        System.out.println ( arr[index]);
	             
	    }
	}
