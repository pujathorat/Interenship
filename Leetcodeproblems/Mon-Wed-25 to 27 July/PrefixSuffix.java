package com.java.julymonth;

public class PrefixSuffix {
	    public static void main(String[] args) {
	        String S = "ababaaaab";
	        int count = findPrefixSuffixSubstringCount(S, "ab");
	        System.out.println("Output: " + count);
	    }

	    public static int findPrefixSuffixSubstringCount(String str, String substr) {
	        int count = 0;
	        int len = str.length();
	        int subLen = substr.length();

	        if (subLen == 0)
	            return 0;

	        for (int i = 0; i <= len - subLen; i++) {
	            String sub = str.substring(i, i + subLen);
	            if (sub.equals(substr)) {
	                count++;
	            }
	        }

	        return count;
	    }
	}

