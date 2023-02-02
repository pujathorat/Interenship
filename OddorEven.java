package com.java.worksheet2;

import java.util.Scanner;

public class OddorEven {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in); //input from user
	System.out.println("Enter a number n:"); 
	int n= input.nextInt(); //value of n
	if(n%2==0)
		System.out.println("Entered number n is even");
		else 
			System.out.println("Entered number n is odd");
		}
	}


