package com.java.julymonth;

public class MajorityElement {
	    // Function to find the majority element
	    public static int findMajorityElement(int[] nums) {
	        int count = 0; // Variable to keep track of the current element's count
	        int candidate = 0; // Variable to store the potential majority element

	        // Loop through the array to find the potential majority element
	        for (int num : nums) {
	            if (count == 0) {
	                // If the count is 0, we have no current candidate element, so assign the current element as the candidate
	                candidate = num;
	            }

	            // If the current element is the same as the candidate, increment the count
	            if (num == candidate) {
	                count++;
	            } else {
	                // If the current element is different, decrement the count
	                count--;
	            }
	        }

	        // At this point, the candidate is the potential majority element.
	        // Now, we need to check if it appears more than N/2 times in the array.

	        // Reset the count to count the occurrences of the candidate element
	        count = 0;
	        for (int num : nums) {
	            if (num == candidate) {
	                count++;
	            }
	        }

	        // If the count of the candidate element is greater than N/2, it is the majority element.
	        if (count > nums.length / 2) {
	            return candidate;
	        }

	        // If no majority element found, return -1
	        return -1;
	    }

	    public static void main(String[] args) {
	        int[] arr = {3, 1, 3, 2, 3};
	        int majorityElement = findMajorityElement(arr);
	        System.out.println("Majority Element: " + majorityElement);
	    }
	}

