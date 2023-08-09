package com.java.julymonth;

	import java.util.Arrays;

	public class TripletSum {
	    public static void main(String[] args) {
	        int[] arr = {1, 4, 45, 6, 10, 8};
	        int n = arr.length;
	        int X = 13;

	        boolean found = findTriplet(arr, n, X);
	        if (found) {
	            System.out.println("A triplet with sum " + X + " was found.");
	        } else {
	            System.out.println("No triplet with sum " + X + " was found.");
	        }
	    }

	    // Function to find a triplet with the given sum
	    public static boolean findTriplet(int[] arr, int n, int X) {
	        Arrays.sort(arr); // Sort the array in ascending order

	        // Fix the first element and then use two pointers approach for the remaining two elements
	        for (int i = 0; i < n - 2; i++) {
	            int left = i + 1; // Pointer to the element next to the fixed element
	            int right = n - 1; // Pointer to the last element

	            while (left < right) {
	                int currentSum = arr[i] + arr[left] + arr[right];

	                // If the current sum is equal to the target sum, a triplet is found
	                if (currentSum == X) {
	                    return true;
	                } else if (currentSum < X) {
	                    // If current sum is less than target sum, move left pointer to the right
	                    left++;
	                } else {
	                    // If current sum is greater than target sum, move right pointer to the left
	                    right--;
	                }
	            }
	        }

	        return false; // No triplet found
	    }
	}

