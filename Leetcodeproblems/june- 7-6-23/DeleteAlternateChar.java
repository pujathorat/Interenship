package com.java.LeetcodeproblemsMayJune;

public class DeleteAlternateChar {
	    public static void main(String[] args) {
	        String input = "Good, Day!";
	        String result = deleteAlternateCharacters(input);
	        System.out.println(result);  // Output: Go,Dy
	    }
	    //deleteAlternateCharacters method takes a string input as a parameter 
        //and returns a new string with alternate characters removed
	    public static String deleteAlternateCharacters(String input) {
	    	//StringBuilder to build the resulting string
	        StringBuilder stringBuilder = new StringBuilder();
	        
	        for (int i = 0; i < input.length(); i++) {
	            if (i % 2 == 0) {
	                stringBuilder.append(input.charAt(i));
	                
	            }
	        }
	      //stringBuilder is converted to a string using the toString method 
	        return stringBuilder.toString();
	    }
	}

