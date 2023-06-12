package com.java.LeetcodeproblemsMayJune;

public class LeadersinJava {
	    public static void main(String[] args) {
	    	//initialize an array
	        int[] array = {16, 17, 4, 3, 5, 2};
	        //findLeaders method, passing the array as an argument
	        findLeaders(array);
	    }
	    
	    public static void findLeaders(int[] array) {
	        int n = array.length;
	        int maxFromRight = array[n - 1];
	        System.out.println("Leaders in the array: ");
	        
	        // The last element is always a leader
	        System.out.print(maxFromRight + " ");
	        
	        // Traverse the array from right to left
	        for (int i = n - 2; i >= 0; i--) {
	            if (array[i] > maxFromRight) {
	                // Current element is a leader
	                maxFromRight = array[i];
	                System.out.print(maxFromRight + " ");
	            }
	        }
	    }
	}