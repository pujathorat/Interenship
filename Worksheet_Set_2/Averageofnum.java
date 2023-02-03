package com.java.worksheet2;

import java.util.Scanner;

public class Averageofnum {
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in); // user input
			System.out.println("Enter first number n1:");
			float n1= input.nextInt();
			System.out.println("Enter second number n2:");
			
			float n2=input.nextInt();
			float A= (n1+n2)/2; //calculating average
			System.out.println("Average of given numbers is \n" + A );
}}

