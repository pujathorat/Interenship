package com.java.Leetcodeproblems;

import java.util.*;

	// Hashing based Java program to find common elements
	// with minimum index sum.
	
	public class MinIndexSum {
	
	 
	    // Function to print common Strings with minimum index sum
	    static void find(Vector<String> list1, Vector<String> list2)
	    {
	        // mapping Strings to their indices
	        Map<String, Integer> map = new HashMap<>();
	        for (int i = 0; i < list1.size(); i++)
	            map.put(list1.get(i), i);
	 
	        Vector<String> res = new Vector<String>(); // resultant list
	 
	        int minsum = Integer.MAX_VALUE;
	        for (int j = 0; j < list2.size(); j++)
	        {
	            if (map.containsKey(list2.get(j)))
	            {
	                // If current sum is smaller than minsum
	                int sum = j + map.get(list2.get(j));
	                if (sum < minsum)
	                {
	                    minsum = sum;
	                    res.clear();
	                    res.add(list2.get(j));
	                }
	 
	                // if index sum is same then put this
	                // String in resultant list as well
	                else if (sum == minsum)
	                    res.add(list2.get(j));
	            }
	        }
	 
	        // Print result
	        for (int i = 0; i < res.size(); i++)
	            System.out.print(res.get(i) + " ");
	    }
	 
	    // Driver code
	    public static void main(String[] args)
	    {
	        // Creating list1
	        Vector<String> list1 = new Vector<String>();
	        list1.add("Basketball");
	        list1.add("Football");
	        list1.add("Cricket");
	        list1.add("Tennis");
	 
	        // Creating list2
	        Vector<String> list2 = new Vector<String>();
	        list2.add("Kabaddi");
	        list2.add("Basketball");
	        list2.add("Kho-Kho");
	 
	        find(list1, list2);
	    }
	}