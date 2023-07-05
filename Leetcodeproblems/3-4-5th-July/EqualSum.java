package com.java.LeetcodeproblemsJuly;

public class EqualSum {
	    public static String equilibrium(int[] arr, int n) {
	        if (n == 0) {
	            return "NO";  // Edge case: empty array
	        }
	        
	        int sum = 0;
	        for (int i = 0; i < n; i++) {
	            sum += arr[i];
	        }
	        
	        int leftSum = 0;
	        for (int i = 0; i < n; i++) {
	            // Calculate right sum by subtracting current element
	            // and left sum from the total sum
	            int rightSum = sum - arr[i] - leftSum;
	            
	            if (leftSum == rightSum) {
	                return "YES";  // Equilibrium point found
	            }
	            
	            leftSum += arr[i];
	        }
	        
	        return "NO";  // Equilibrium point not found
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 3, 5, 2, 2};
	        int size = arr.length;
	        String result = equilibrium(arr, size);
	        System.out.println(result);  // Output: YES
	    }
	}
