package com.java.LeetcodeproblemsMayJune;

public class NextHappyNum {
		  //sumOfSquares method calculates the sum of squares of each digit in a given number
	    public static int sumOfSquares(int num) {
	        int sum = 0;
	        while (num > 0) {
	            int digit = num % 10;
	            sum += digit * digit;
	            num /= 10;
	        }
	        return sum;
	    }
//isHappyNumber method determines whether a number is a happy number 
	    //by repeatedly calculating the sum of squares of its digits 
	    //until the sum becomes either 1 or 4
	    public static boolean isHappyNumber(int num) {
	        while (num != 1 && num != 4) {
	            num = sumOfSquares(num);
	        }
	        return num == 1;
	    }
//getNextHappyNumber method finds the next happy number after a given number
	    //by incrementing it and checking each subsequent number
	    //until a happy number is found
	    public static int getNextHappyNumber(int num) {
	        num++;
	        while (!isHappyNumber(num)) {
	            num++;
	        }
	        return num;
	    }

	    public static void main(String[] args) {
	        int startingNumber = 13; // Change this value to the desired starting number
	        int nextHappy = getNextHappyNumber(startingNumber);
	        System.out.println("The next happy number after " + startingNumber + " is: " + nextHappy);
	    }
	}
