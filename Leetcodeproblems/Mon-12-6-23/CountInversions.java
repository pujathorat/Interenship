package com.java.LeetcodeproblemsMayJune;
//countInversions method 
//takes an array as input and 
//returns the total number of inversions in the array
public class CountInversions {
	    public static void main(String[] args) {
	        int[] arr = {1, 3, 2, 4, 5, 6, 7};
	        int inversionCount = countInversions(arr);
	        System.out.println("Number of inversions: " + inversionCount);
	    }

	   
	    public static int countInversions(int[] arr) {
	        return mergeSort(arr, 0, arr.length - 1);
	    }
//mergeSort method performs the merge sort algorithm and 
	    //counts the inversions during the merging process using the merge method
	    public static int mergeSort(int[] arr, int left, int right) {
	        int inversionCount = 0;
	        if (left < right) {
	            int mid = (left + right) / 2;
	            inversionCount += mergeSort(arr, left, mid);
	            inversionCount += mergeSort(arr, mid + 1, right);
	            inversionCount += merge(arr, left, mid, right);
	        }
	        return inversionCount;
	    }

	    public static int merge(int[] arr, int left, int mid, int right) {
	        int[] temp = new int[right - left + 1];
	        int i = left;
	        int j = mid + 1;
	        int k = 0;
	        int inversionCount = 0;

	        while (i <= mid && j <= right) {
	            if (arr[i] <= arr[j]) {
	                temp[k++] = arr[i++];
	            } else {
	                temp[k++] = arr[j++];
	                inversionCount += (mid - i + 1); // Count the inversions
	            }
	        }

	        while (i <= mid) {
	            temp[k++] = arr[i++];
	        }

	        while (j <= right) {
	            temp[k++] = arr[j++];
	        }

	        for (i = left, k = 0; i <= right; i++, k++) {
	            arr[i] = temp[k];
	        }

	        return inversionCount;
	    }
	}

