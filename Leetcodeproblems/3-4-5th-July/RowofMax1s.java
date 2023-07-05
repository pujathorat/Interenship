package com.java.LeetcodeproblemsJuly;

public class RowofMax1s {
	    public static void main(String[] args) {
	        boolean[][] arr = {
	            {true, true, false, false},
	            {true, true, true, false},
	            {true, false, false, false},
	            {true, true, true, true}
	        };
	        int n = 4;
	        int m = 4;

	        int rowIndex = rowWithMax1s(arr, n, m);
	        System.out.println("Row with the most 1s: " + rowIndex);
	    }

	    public static int rowWithMax1s(boolean[][] arr, int n, int m) {
	        int maxCount = 0; // Maximum count of 1s found so far
	        int maxRowIndex = -1; // Index of the row with maximum count of 1s

	        // Iterate through each row
	        for (int i = 0; i < n; i++) {
	            int count = 0; // Count of 1s in the current row

	            // Iterate through each column in the current row
	            for (int j = 0; j < m; j++) {
	                if (arr[i][j]) {
	                    count++; // Increment count if the current element is true
	                }
	            }

	            // Update maxCount and maxRowIndex if a row with more 1s is found
	            if (count > maxCount) {
	                maxCount = count;
	                maxRowIndex = i;
	            }
	        }

	        return maxRowIndex;
	    }
	}

