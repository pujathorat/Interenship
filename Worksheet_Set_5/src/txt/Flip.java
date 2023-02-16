package com.java.worksheet5;

public class Flip {
		public static void main(String args[])
		{
		try
		{
		System.out.println("First statement of try block");
		int num=45/3;
		System.out.println(num);
		}
		catch(Exception e)
		{
		System.out.println("FlipRobo caught Exception");
		}
		finally
		{
		System.out.println("finally block");
		}
		System.out.println("Main method");
		}
		}
