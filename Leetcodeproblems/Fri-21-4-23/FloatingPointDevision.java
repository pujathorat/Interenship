package com.java.julymonth;

public class FloatingPointDevision {
	    public static void main(String[] args) {
	        // Given input numbers
	        double a = 8.433;
	        double b = 2.6579;

	        // Calculate the result of division
	        double result = a / b;
	        // Round the result to 3 decimal places
	  //The Math.round() method is used to round the result to three decimal places.
	        double roundedResult = Math.round(result * 1000.0) / 1000.0;
	        
	   // Print the result with 3 decimal places
	 //The %.3f format specifier in the System.out.format() method ensures that
 //the floating-point numbers are displayed with three digits after the decimal point. 

	        System.out.format("%.3f %.3f", result, roundedResult);
	    }
	}

