package com.java.Leetcodeproblems;

import java.util.Scanner;

public class SumofPowersofnum3 {

// Java program to check whether the given
// N can be represented as the sum of
// the distinct powers of 3
public static void DistinctPowersOf3(int N)
{
   
    // Iterate until N is non-zero
    while (N > 0) {
 
        // Termination Condition
        if (N % 3 == 2) {
            System.out.println("No");
            return;
        }
 
        // Right shift ternary bits
        // by 1 for the next digit
        N /= 3;
    }
 
    // If N can be expressed as the
    // sum of perfect powers of 3
    System.out.println("Yes");
}
 
// Driver Code
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int N=s.nextInt();
 
    DistinctPowersOf3(N);
}
}
