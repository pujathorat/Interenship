package com.java.julymonth;

	import java.util.*;

	public class RotateArrayLeft {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Input the size of the array and the number of rotations
	        System.out.println("Input the size of the array- N:");
	        int N = scanner.nextInt();
	        System.out.println("Number of Rotation- D:");
	        int D = scanner.nextInt();
	        
	        int[] arr = new int[N];
	        System.out.println("Array is:");
	        // Input the array elements
	        for (int i = 0; i < N; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        
	        // Rotate the array
	        rotateLeft(arr, D);
	        
	        // Print the rotated array
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        
	        scanner.close();
	    }
	    
	    // Function to rotate the array to the left by D steps
	    static void rotateLeft(int[] arr, int D) {
	        int N = arr.length;
	        
	        // To handle cases where D > N
	        D = D % N;
	        
	        // Reverse the first D elements
	        reverse(arr, 0, D - 1);
	        
	        // Reverse the remaining N - D elements
	        reverse(arr, D, N - 1);
	        
	        // Reverse the entire array
	        reverse(arr, 0, N - 1);
	    }
	    
	    // Function to reverse a portion of the array
	    static void reverse(int[] arr, int start, int end) {
	        while (start < end) {
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            start++;
	            end--;
	        }
	    }
	}
