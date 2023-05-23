package com.java.LeetcodeproblemsMayJune;

	import java.io.*;
	public class PowerofThree {
	    public static void main(String[] args)
	    {
	        int b = 81;
	        int a = 3;
	          // computing power
	        double p = Math.log10(b)/ Math.log10(a);
	        // checking to see if power is an integer or not
	        if (p - (int)p == 0) {
	            System.out.println("YES");
	        }
	        else
	            System.out.println("NO");
	    }
	}
