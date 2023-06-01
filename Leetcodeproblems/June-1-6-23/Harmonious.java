package com.java.LeetcodeproblemsMayJune;

public class Harmonious { 
	public static int lengthOfLHS(int[] inputArr, int len)  
	{  
	int ans = 0; // for storing the final answer  
	  
	// Iterating from j = 0 to 2 ^ len - 1  
	for (int j = 0; j < (1l << len); j++)  
	{  
	    // Variables for storing the minimum, maximum values and   
	    // the length of the subsequence, respectively  
	  
	    int minVal = Integer.MAX_VALUE;  
	    int maxVal = Integer.MIN_VALUE;  
	    int currLen = 0;  
	  
	    // Iterating over the input array array  
	    for (int k = 0; k < len; k++)  
	    {  
	        // If the kth bit of j is set  
	        if ((j & (1 << k)) != 0)  
	        {  
	            currLen = currLen + 1;  
	            minVal = Math.min(minVal, inputArr[k]);  
	            maxVal = Math.max(maxVal, inputArr[k]);  
	        }  
	    }  
	  
	    // If the maximum difference is 1, then it is a harmonic subsequence  
	    // The rest of the other conditions are there to avoid overflow of Integer  
	    if (maxVal != Integer.MIN_VALUE && minVal != Integer.MAX_VALUE && maxVal - minVal == 1)  
	    {  
	        ans = Math.max(ans, currLen);  
	    }  
	}  
	  
	// returning the final answer  
	return ans;  
	}  
	  
	  
	// main method  
	public static void main(String args[])   
	{  
	  // creating an object of the class LongestHarmoniousSubsequence  
		Harmonious obj = new Harmonious();  
	  
	// input array  
	int inputArr[] = {11, 12, 12, 13, 14, 15, 11, 11, 11, 11};  
	int sze = inputArr.length; // computing size of the input array  
	  
	System.out.println("For the input array: ");  
	for(int i = 0 ; i < sze; i++)  
	{  
	System.out.print(inputArr[i] + " ");  
	}  
	System.out.println( );  
	// invoking the method lengthOfLHS() for computing the   
	// longest length of the Harmonic subsequence  
	int ans = obj.lengthOfLHS(inputArr, sze);  
	  
	System.out.println("The length of the longest Harmonic subsequence is: " + ans);  
	  
	System.out.println( "\n" );  
	  
	// input array  
	int inputArr1[] = {0, 1, 5, 8, 10, 19, 15, 25, 30, 40, 45, 7, 11};  
	sze = inputArr1.length; // computing size of the input array  
	  
	System.out.println("For the input array: ");  
	for(int i = 0 ; i < sze; i++)  
	{  
	System.out.print(inputArr1[i] + " ");  
	}  
	System.out.println( );  
	// invoking the method lengthOfLHS() for computing the   
	// longest length of the Harmonic subsequence  
	ans = obj.lengthOfLHS(inputArr1, sze);  
	System.out.println("The length of the longest Harmonic subsequence is: " + ans);  
	  
	  
	}  
	}  