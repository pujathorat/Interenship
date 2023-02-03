package com.java.worksheet2;


	import java.util.Scanner;
	public class Swapping {
			public static void main(String[] args) {
				Scanner input=new Scanner(System.in); // user input
				System.out.println("Enter first number n1:");
				int n1= input.nextInt();
				System.out.println("Enter second number n2:");
				
				int n2=input.nextInt();
				//swapping condition
				int temp=n1;
				n1=n2;
				n2=temp;
				System.out.println("values of n1 & n2 are \n" +n1 + "\n & " +  n2);
			}}
