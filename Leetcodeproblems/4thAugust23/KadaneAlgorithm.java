package com.java.julymonth;

public class KadaneAlgorithm {

    // Kadane's algorithm function to find maximum sum subarray
    public static int kadane(int[] arr) {
        int maxEndingHere = arr[0]; // Initialize the maximum sum ending at the current index
        int maxSoFar = arr[0]; // Initialize the maximum sum found so far

        for (int i = 1; i < arr.length; i++) {
            // Update maxEndingHere by either including the current element or starting a new subarray
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);

            // Update maxSoFar if the current subarray sum is greater than the previously known maximum
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar; // Return the maximum sum found
    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int maxSum = kadane(arr);
        System.out.println("Maximum sum of the subarray: " + maxSum);
    }
}


