package com.java.julymonth;

public class StringRangePrint {
	    public static void main(String[] args) {
	        String S = "GoodEvening!";
	        int L = 2;
	        int R = 8;

	        String result = getSubstringInRange(S, L, R);
	        System.out.println(result);
	    }

	    public static String getSubstringInRange(String str, int L, int R) {
	        // Make sure L and R are within valid bounds
	        if (L < 0 || R >= str.length() || L > R) {
	            throw new IllegalArgumentException("Invalid range.");
	        }

	        // Use the substring method to get the characters in the specified range
	        return str.substring(L, R + 1);
	    }
	}
