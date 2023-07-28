package com.java.julymonth;

	import java.util.Scanner;

	public class InputPrinter {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input the string and the integer
	        System.out.print("Enter a string: ");
	        String inputString = sc.nextLine();

	        System.out.print("Enter an integer: ");
	        int inputInteger = sc.nextInt();

	        // Print the output
	        System.out.println("The input string: " + inputString);
	        System.out.println("The input integer: " + inputInteger);
	    }
	}

