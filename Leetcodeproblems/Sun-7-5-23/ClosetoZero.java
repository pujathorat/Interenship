package com.java.LeetcodeproblemsMayJune;
//a positive and negative numbers close to zero.
	public class ClosetoZero {    
	    public static void main(String[] args) {    
	    	//Given Numbers
	    	int[] data = {2,3,-1,-2};    
	        int curr = 0;    
	        int near = data[0];     
	        // find the element nearest to zero    
	        for ( int i=0; i < data.length; i++ ){    
	            curr = data[i] * data[i];     
	            if ( curr <= (near * near) )  {     
	                near = data[i]; 
	            }     
	        }    
	        System.out.println( near );    
	    }    
	}