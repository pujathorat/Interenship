package com.java.LeetcodeproblemsMayJune;

	// Java program to check whether the given number is a perfect number or not

	import java.util.*;
	public class PerfectNumCheck {
		// Returns true if n is perfect
	public static boolean is_perfect_number(int n)
	{
		// To store sum of divisors
	int sum = 1;
	// Find all divisors and add them
	for (int i=2; i*i<=n; i++)
	{
	if (n%i==0)
	{
	if(i*i!=n)
	sum = sum + i + n/i;
	else
	sum=sum+i;
	}
	}
	// If sum of divisors is equal to
    // n, then n is a perfect number
	if (sum == n && n != 1)
	return true;

	return false;
	}

	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number :");
	int num = sc.nextInt();

	if(is_perfect_number(num))
	{
	System.out.print(num + "is a Perfect Number\n");
	}
	else
	{
	System.out.print(num + "is not a Perfect Number\n");
	}
	}
	}

