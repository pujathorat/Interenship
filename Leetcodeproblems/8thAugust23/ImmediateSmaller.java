package com.java.julymonth;

	import java.util.Scanner;

	public class ImmediateSmaller {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter value of N:");
	        int N = scanner.nextInt(); // Read the size of the array
	        int[] Arr = new int[N];    // Create an array to store the elements
	        
	        // Read the elements of the array
	        for (int i = 0; i < N; i++) {
	            Arr[i] = scanner.nextInt();
	        }
	        
	        // Iterate through the array elements
	        for (int i = 0; i < N - 1; i++) {
	            if (Arr[i + 1] < Arr[i]) {
	                System.out.print(Arr[i + 1] + " "); // Print the next element if smaller
	            } else {
	                System.out.print("-1 "); // Print -1 if next element is not smaller
	            }
	        }
	        
	        // For the last element, always print -1
	        System.out.println("-1");
	    }
	}
