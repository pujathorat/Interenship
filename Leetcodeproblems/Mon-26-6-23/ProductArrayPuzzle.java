package com.java.LeetcodeproblemsMayJune;

public class ProductArrayPuzzle {
	    public static int[] productExceptSelf(int[] nums, int n) {
	        int[] result = new int[n];
	        
	        // Calculate the product of all elements to the left of each index
	        int leftProduct = 1;
	        for (int i = 0; i < n; i++) {
	            result[i] = leftProduct;
	            leftProduct *= nums[i];
	        }
	        
	        // Calculate the product of all elements to the right of each index and multiply with the left product
	        int rightProduct = 1;
	        for (int i = n - 1; i >= 0; i--) {
	            result[i] *= rightProduct;
	            rightProduct *= nums[i];
	        }
	        
	        return result;
	    }
	    
	    public static void main(String[] args) {
	        int[] nums = {1, 2, 3, 4};
	        int n = nums.length;
	        
	        int[] result = productExceptSelf(nums, n);
	        
	        System.out.print("Product array: ");
	        for (int num : result) {
	            System.out.print(num + " ");
	        }
	    }
	}

