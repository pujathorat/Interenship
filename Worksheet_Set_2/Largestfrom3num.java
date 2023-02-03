package com.java.worksheet2;

	import java.util.Scanner;
	public class Largestfrom3num {
			public static void main(String[] args) {
				Scanner input=new Scanner(System.in);
				System.out.println("Enter first number n1:");
				int n1= input.nextInt();
				System.out.println("Enter second number n2:");
				
				int n2=input.nextInt();
                System.out.println("Enter second number n3:");
				int n3=input.nextInt();
				if(n1>n2 && n1>n3) {
					System.out.println("n1 is greatest");
				} 
				else
				if(n2>n3){
					System.out.println("n2 is greatest");}
				else
					
						System.out.println("n3 is greatest");
					}
				}
