package com.java.LeetcodeproblemsMayJune;
	// Java implementation of program
	import java.util.*;
	import java.io.*;
	 
	public class CommonFactors {
	    // map to store the count of each prime factor of a
	    static HashMap<Integer, Integer> ma = new HashMap<>();
	 
	    // method that calculate the count of
	    // each prime factor of a number
	    static void primeFactorize(int a)
	    {
	        for (int i = 2; i * i <= a; i += 2) {
	            int cnt = 0;
	            while (a % i == 0) {
	                cnt++;
	                a /= i;
	            }
	            ma.put(i, cnt);
	        }
	        if (a > 1)
	            ma.put(a, 1);
	    }
	 
	    // method to calculate all common divisors
	    // of two given numbers
	    // a, b --> input integer numbers
	    static int commDiv(int a, int b)
	    {
	        // Find count of each prime factor of a
	        primeFactorize(a);
	 
	        // stores number of common divisors
	        int res = 1;
	 
	        // Find the count of prime factors of b using
	        // distinct prime factors of a
	        for (Map.Entry<Integer, Integer> m : ma.entrySet()) {
	            int cnt = 0;
	 
	            int key = m.getKey();
	            int value = m.getValue();
	 
	            while (b % key == 0) {
	                b /= key;
	                cnt++;
	            }
	 
	            // prime factor of common divisor
	            // has minimum cnt of both a and b
	            res *= (Math.min(cnt, value) + 1);
	        }
	        return res;
	    }
	 
	    // Driver method
	    public static void main(String args[])
	    {
	        int a = 12, b = 24;
	        System.out.println(commDiv(a, b));
	    }
	}