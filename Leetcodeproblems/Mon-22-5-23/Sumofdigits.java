package com.java.recursionsum;

public class Sumofdigits {
//function to check sum
	//of digits using recursion
	public static int sum_of_digit(int n)
	{
		if(n==0) {
			return 0;
		}
		return(n % 10 + sum_of_digit(n/10));
	}
	//driven program
	public static void main(String[] args)
	{
		int num=6789;
		int result= sum_of_digit(num);
		System.out.println("Sum of digits in" +  num  + "is\n" +  result);
	}
}
