package com.java.WorksheetB;

public class NumPowerofTwo {
		public static void main(String args[]) 
	{ System.out.printf("is %d power of Two? %b%n", 2, isPowerofTwo(2)); 
	System.out.printf("is %d power of Two? %b%n", 4, isPowerofTwo(4)); 
	System.out.printf("is %d power of Two? %b%n", 5, isPowerofTwo(5)); 
	System.out.printf("is %d power of Two? %b%n", 8, isPowerofTwo(8)); 
	System.out.printf("is %d power of Two? %b%n", 64, isPowerofTwo(64));
	System.out.printf("is %d power of Two? %b%n", 216, isPowerofTwo(216));
	System.out.printf("is %d power of Two? %b%n", 1, isPowerofTwo(1));
	System.out.printf("is %d power of Two? %b%n", -1, isPowerofTwo(-1)); }
	
		/* * @return true, if number is power of two, otherwise false. */ 
	
	public static boolean isPowerofTwo(int number)
	{ return (number & (number - 1)) == 0; }
	}
	


