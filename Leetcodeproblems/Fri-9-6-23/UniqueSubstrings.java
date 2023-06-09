package com.java.LeetcodeproblemsMayJune;


	import java.util.HashSet;

	public class UniqueSubstrings {
	    public static HashSet<String> findUniqueSubstrings(String str) {
	        HashSet<String> uniqueSubstrings = new HashSet<>();

	        // Iterate over each character in the string
	        for (int i = 0; i < str.length(); i++) {
	            for (int j = i + 1; j <= str.length(); j++) {
	                // Extract the substring from the starting index to the ending index
	                String substring = str.substring(i, j);
	                // Add the substring to the HashSet
	                uniqueSubstrings.add(substring);
	            }
	        }

	        return uniqueSubstrings;
	    }

	    public static void main(String[] args) {
	        String input = "abcde";
	        HashSet<String> uniqueSubstrings = findUniqueSubstrings(input);

	        // Print the unique substrings
	        for (String substring : uniqueSubstrings) {
	            System.out.println(substring);
	        }
	    }
	}

