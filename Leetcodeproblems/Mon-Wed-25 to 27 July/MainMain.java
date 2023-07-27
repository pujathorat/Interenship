package com.java.julymonth;

	import java.util.ArrayList;
	import java.util.List;

	interface in1 {
	    void display(int p);
	}

	class testClass implements in1 {

	    @Override
	    public void display(int k) {
	        int count = countPrimesBetweenTwoAndK(k);
	        System.out.println("Total number of prime numbers between 2 and " + k + " (inclusive): " + count);
	    }

	    private int countPrimesBetweenTwoAndK(int k) {
	        int count = 0;
	        for (int i = 2; i <= k; i++) {
	            if (isPrime(i)) {
	                count++;
	            }
	        }
	        return count;
	    }

	    private boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}

	public class MainMain {
	    public static void main(String[] args) {
	        testClass obj = new testClass();
	        int inputNumber = 20; 
	        obj.display(inputNumber);
	    }
	}
