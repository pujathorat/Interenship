package com.java.LeetcodeproblemsMayJune;

//Here binary search is used to find the bitonic point in the array

public class BitonicPoint {
	//findBitonicPoint method takes an array as input 
	//and returns the index of the bitonic point. 
	//If no bitonic point is found, it returns -1
	
	    public static int findBitonicPoint(int[] arr) {
	        int left = 0;
	        int right = arr.length - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (mid > 0 && mid < arr.length - 1) {
	                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
	                    return mid;
	                } else if (arr[mid - 1] > arr[mid]) {
	                    right = mid - 1;
	                } else {
	                    left = mid + 1;
	                }
	            } else if (mid == 0) {
	                if (arr[mid] > arr[mid + 1]) {
	                    return mid;
	                } else {
	                    return -1; // No bitonic point found
	                }
	            } else if (mid == arr.length - 1) {
	                if (arr[mid] > arr[mid - 1]) {
	                    return mid;
	                } else {
	                    return -1; // No bitonic point found
	                }
	            }
	        }

	        return -1; // No bitonic point found
	    }

	    public static void main(String[] args) {
	        int[] arr = { 1, 3, 8, 12, 4, 2 };

	        int bitonicPoint = findBitonicPoint(arr);

	        if (bitonicPoint != -1) {
	            System.out.println("Bitonic point found at index " + bitonicPoint);
	        } else {
	            System.out.println("No bitonic point found");
	        }
	    }
	}

