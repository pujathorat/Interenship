package com.java.LeetcodeproblemsMayJune;

public class PeakElement {
	    public static int findPeakElement(int[] nums) {
	        int left = 0;
	        int right = nums.length - 1;

	        while (left < right) {
	            int mid = left + (right - left) / 2;

	            // Check if mid is a peak element
	            if (nums[mid] > nums[mid + 1]) {
	                right = mid; // Move to the left half
	            } else {
	                left = mid + 1; // Move to the right half
	            }
	        }

	        // Left pointer will be pointing to the peak element
	        return nums[left];
	    }

	    public static void main(String[] args) {
	        int[] nums = {1, 2, 3, 4,5}; // Example array

	        int peakElement = findPeakElement(nums);
	        System.out.println("Peak element: " + peakElement);
	    }
	}
