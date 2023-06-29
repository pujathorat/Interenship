package com.java.LeetcodeproblemsMayJune;
import java.util.Arrays;

	public class Anagram {
	    public static boolean areAnagrams(String str1, String str2) {
	        // Remove whitespace and convert strings to lowercase
	        str1 = str1.replaceAll("\\s", "").toLowerCase();
	        str2 = str2.replaceAll("\\s", "").toLowerCase();
	        
	        // Check if the lengths are equal
	        if (str1.length() != str2.length()) {
	            return false;
	        }
	        
	        // Convert strings to character arrays and sort them
	        char[] charArray1 = str1.toCharArray();
	        char[] charArray2 = str2.toCharArray();
	        Arrays.sort(charArray1);
	        Arrays.sort(charArray2);
	        
	        // Compare the sorted character arrays
	        return Arrays.equals(charArray1, charArray2);
	    }
	    
	    public static void main(String[] args) {
	        String str1 = "earth";
	        String str2 = "heart";
	        
	        if (areAnagrams(str1, str2)) {
	            System.out.println(str1 + " and " + str2 + " are anagrams.");
	        } else {
	            System.out.println(str1 + " and " + str2 + " are not anagrams.");
	        }
	    }
	}
