package com.java.LeetcodeproblemsMayJune;
import java.util.ArrayList;
import java.util.List;
public class AdditivesNumber {
	// Checks whether num is valid or not, by
    // checking first character and size
    private static boolean isValid(String num)
    {
        if (num.length() > 1 && num.charAt(0) == '0')
            return false;
        return true;
    }
	 public static List<String> additiveSequence(String num)
	    {
	        List<String> res = new ArrayList<>();
	        int l = num.length();
	  
	        // loop until l/2 only, because if first
	        // number is larger,then no possible sequence
	        // later
	        for (int i = 1; i <= l / 2; i++) {
	        	
	        	
	            for (int j = 1; j <= (l - i) / 2; j++) {
	                if (checkAddition(res, num.substring(0, i),
	                                  num.substring(i, i + j),
	                                  num.substring(i + j))) {
	                    // adding first and second number at
	                    // front of result list
	                    res.add(0, num.substring(0, i));
	                    res.add(1, num.substring(i, i + j));
	                    return res;
	                }
	            }
	        }
	  
	        // If code execution reaches here, then string
	        // doesn't have any additive sequence
	        res.clear();
	        return res;
	    }
	  
	    // Method to print result list
	  
	    private static boolean checkAddition(List<String> res, String substring, String substring2, String substring3) {
		// TODO Auto-generated method stub
		return false;
	}
		// Driver code to test above methods
	    public static void main(String[] args)
	    {
	        String num = "2358131";
	        List<String> res = additiveSequence(num);
	        if (res.size() > 0)
	            System.out.println( "True");
	        else
	           System.out.println( "False");
	        num = "199100199";
	        res = additiveSequence(num);
	        if (res.size() > 0)
	            System.out.println( "True");
	        else
	          System.out.println( "True");
	    }
	}
