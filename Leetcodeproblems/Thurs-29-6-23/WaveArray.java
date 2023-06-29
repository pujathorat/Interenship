package com.java.LeetcodeproblemsMayJune;

	import java.util.Arrays;

	public class WaveArray {
	    public static void main(String[] args) {
	        int[] array = {2, 4, 6, 8, 10, 12, 14};

	        System.out.println("Original array: " + Arrays.toString(array));
	        waveSort(array);
	        System.out.println("Wave array: " + Arrays.toString(array));
	    }
//waveSort method that takes an array as input and 
	    //sorts it in ascending order using the Arrays.sort method
	    public static void waveSort(int[] array) {
	        Arrays.sort(array); // Sort the array in ascending order

	        for (int i = 0; i < array.length - 1; i += 2) {
	            swap(array, i, i + 1); // Swap adjacent elements
	        }
	    }

	    public static void swap(int[] array, int i, int j) {
	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	    }
	}


