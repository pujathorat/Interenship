package com.java.LeetcodeproblemsMayJune;


	// Java program for Detecting capital 
	import java.util.*;
	 
	public class DetectCapital {
	 
	  // Function to check if uppercase
	  // characters are used correctly or not
	  static boolean detectUppercaseUse(char []word)
	  {
	 
	    // Loop to iterate through
	    // the given String S
	    for (int i = 1; i < word.length; i++) {
	 
	      // Current character is
	      // Capital and previous
	      // character is small
	      if (word[i] - 'A' < 32
	          && word[i - 1] - 'A' >= 32) {
	        return false;
	      }
	 
	      // Current character is
	      // small and previous is
	      // a capital character
	      else if (word[i] - 'A' >= 32
	               && word[i - 1] - 'A' < 32) {
	 
	        // If previous char
	        // is the 1st char
	        if (i - 1 == 0)
	          continue;
	 
	        return false;
	      }
	    }
	 
	    // Return true
	    return true;
	  }
	 
	  // Driver Code
	  public static void main(String[] args)
	  {
	    String S = "HELLO";
	    System.out.print(detectUppercaseUse(S.toCharArray()) ? "Yes" : "No");
	  }
	}
