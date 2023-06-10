package com.java.LeetcodeproblemsMayJune;

public class MajorityElement {
//	findMajorityElement method takes an array of integers as input 
    // and returns the majority element if it exists
	    public static int findMajorityElement(int[] nums) {
	        int count = 0;
	        int candidate = 0;
	        
	        for (int num : nums) {
	            if (count == 0) {
	                candidate = num;
	                count = 1;
	            } else if (candidate == num) {
	                count++;
	            } else {
	                count--;
	            }
	        }
	        
	        // Verifying if the candidate is the majority element
	        count = 0;
	        for (int num : nums) {
	            if (num == candidate) {
	                count++;
	            }
	        }
	        
	        if (count > nums.length / 2) {
	            return candidate;
	        } else {
	            throw new IllegalArgumentException("No majority element found");
	            //If there is no majority element, 
	            //it throws an IllegalArgumentException
	        }
	    }
	    
	    public static void main(String[] args) {
	        int[] nums = {3, 1, 3, 3, 2};
	        int majorityElement = findMajorityElement(nums);
	        System.out.println("Majority Element: " + majorityElement);
	    }
	}
