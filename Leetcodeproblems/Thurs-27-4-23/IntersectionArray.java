package com.java.Leetcodeproblems;
//To find the intersection of two arrays in java
public class IntersectionArray {
	   public static void main(String args[]) {
	      int Array1[] = {23, 36, 96, 78, 55};
	      int Array2[] = {78, 45, 19, 73, 55};
	      System.out.println("Intersection of the two arrays ::");
	   
	      //to iterate the elements of the first array 
	      for(int i = 0; i<Array1.length; i++ ) {
	    	
	    	  //to iterate the elements of the second array
	         for(int j = 0; j<Array2.length; j++) {
	            if(Array1[i]==Array2[j]) {
	               System.out.println(Array2[j]);
	            }
	         }
	      }
	   }
	}