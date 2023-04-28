package com.java.Leetcodeproblems;

	import java.util.*;
	 
	public class SortbyStringChar {
	    // Returns count of character in the string
	    static int countFrequency(String str, char ch)
	    {
	        int count = 0;
	 
	        for (int i = 0; i < str.length(); i++) {
	            // Check for character
	            if (str.charAt(i) == ch) {
	                ++count;
	            }
	        }
	 
	        return count;
	    }
	 
	    // Function to sort the string according to the
	    // frequency of characters in ascending order
	    static void sortArr(String str)
	    {
	        int n = str.length();
	 
	        // Dictionary to store the frequency of characters
	        Map<Character, Integer> freqDict
	            = new HashMap<Character, Integer>();
	 
	        // Count the frequency of each character in the
	        // input string
	        for (int i = 0; i < n; i++) {
	            if (freqDict.containsKey(str.charAt(i))) {
	                freqDict.put(str.charAt(i),
	                             freqDict.get(str.charAt(i))
	                                 + 1);
	            }
	            else {
	                freqDict.put(str.charAt(i), 1);
	            }
	        }
	 
	        // Sort the dictionary by value (frequency) in
	        // ascending order
	        List<Map.Entry<Character, Integer> > sortedDict
	            = new ArrayList<Map.Entry<Character, Integer> >(
	                freqDict.entrySet());
	        Collections.sort(
	            sortedDict,
	            new Comparator<
	                Map.Entry<Character, Integer> >() {
	                public int compare(
	                    Map.Entry<Character, Integer> o1,
	                    Map.Entry<Character, Integer> o2)
	                {
	                    return (o1.getValue()
	                            == (o2.getValue()))
	                        ? o1.getKey() - o2.getKey()
	                        : o1.getValue() - o2.getValue();
	                }
	            });
	 
	        // Print the sorted characters in the order of their
	        // frequency
	        for (Map.Entry<Character, Integer> entry :
	             sortedDict) {
	            for (int i = 0; i < entry.getValue(); i++) {
	                System.out.print(entry.getKey());
	            }
	        }
	    }
	 
	    // Driver code
	    public static void main(String[] args)
	    {
	        String str = "ohmygod";
	     
	          // Driver code
	        sortArr(str);
	    }
	}
