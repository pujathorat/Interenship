package com.java.worksheet2;

import java.util.Scanner;

public class Tableofn {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number n:"); //number for table
		int n= input.nextInt();
		System.out.println("The table for the value of :" + n );
		for(int i=1; i<=10; i++) {
		System.out.println(n*i);
		}
}}