package com.java.LeetcodeproblemsJuly;

	import java.util.*;
	import java.lang.*;
	import java.io.*;

	public class CommonPrefixStr {
		public String longestCommonPrefix(String[] S) {
			if (S.length == 0) 
				return "";
			//This line initializes a string variable prefix with the value
			//of the first string in the input array S
			String prefix = S[0];
			for (int i = 1; i < S.length; i++)
				while (S[i].indexOf(prefix) != 0) {
					prefix = prefix.substring(0, prefix.length() - 1);
					if (prefix.isEmpty()) return "";
				}        
			return prefix;
		}
		
		public static void main(String args[]) {
			// It creates an instance of the CommonPrefixStr class (obj),
			//initializes an array of strings s with three values,
			//and then calls the longestCommonPrefix method of the obj instance,
			//passing the s array as the argument
			
			CommonPrefixStr  obj = new CommonPrefixStr ();
			String S[] = {"flower", "flow", "flight"};
			//prints the result returned by the longestCommonPrefix method
			System.out.println("Longest Common Prefix is:");
			System.out.println(obj.longestCommonPrefix(S));
		}
	}
