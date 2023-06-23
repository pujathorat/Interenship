package com.java.LeetcodeproblemsMayJune;

	
		import java.util.ArrayList;
		import java.util.List;

		public class CircleofString {
		    public static void main(String[] args) {
		        // Create a list of strings
		        List<String> strings = new ArrayList<>();
		        strings.add("apple");
		        strings.add("egg");
		        strings.add("grapes");
		        strings.add("salad");
		        
		        // Check if the strings can form a circle
		        boolean canFormCircle = checkCircleOfStrings(strings);
		        
		        // Print the result
		        if (canFormCircle) {
		            System.out.println("The strings can form a circle.");
		        } 
		        else {
		            System.out.println("The strings cannot form a circle.");
		        }
		    }
		    
		    // Method to check if the given strings can form a circle
		    public static boolean checkCircleOfStrings(List<String> strings) {
		        // Base case: If the list is empty or contains only one element, return true
		        if (strings.isEmpty() || strings.size() == 1) {
		            return true;
		        }
		        
		        // Initialize the first string as the starting string
		        String startString = strings.get(0);
		        
		        // Recursive helper function to find a valid circle of strings
		        return canFormCircle(startString, strings, new ArrayList<>());
		    }
		    
		    // Recursive helper function to find a valid circle of strings
		    private static boolean canFormCircle(String currentString, List<String> remainingStrings, List<String> visited) {
		        // Add the current string to the visited list
		        visited.add(currentString);
		        
		        // Base case: If all strings have been visited and the last string forms a circle with the first string, return true
		        if (remainingStrings.isEmpty() && currentString.charAt(currentString.length() - 1) == visited.get(0).charAt(0)) {
		            return true;
		        }
		        
		        // Check each remaining string to find the next valid string in the circle
		        for (String str : remainingStrings) {
		            // If the last character of the current string matches the first character of the next string
		            if (currentString.charAt(currentString.length() - 1) == str.charAt(0)) {
		                // Create a new list of remaining strings without the current string
		                List<String> updatedRemainingStrings = new ArrayList<>(remainingStrings);
		                updatedRemainingStrings.remove(str);
		                
		                // Recursive call to continue building the circle
		                if (canFormCircle(str, updatedRemainingStrings, visited)) {
		                    return true;
		                }
		            }
		        }
		        
		        // Remove the current string from the visited list before backtracking
		        visited.remove(currentString);
		        
		        return false;
		    }
		}
