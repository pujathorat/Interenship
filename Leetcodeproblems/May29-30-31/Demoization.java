package com.java.LeetcodeproblemsMayJune;

	import java.util.Arrays;

	public class Demoization {
	    public static int minDistance(String word1, String word2) {
	        int[][] memo = new int[word1.length()][word2.length()];
	        for (int[] row : memo) {
	            Arrays.fill(row, -1);
	        }
	        return deleteOperation(word1, word2, 0, 0, memo);
	    }
// deleteOperation function is a recursive function that takes the two words,
	    //their current indices (i, j), and the memoization array as parameters.
	    public static int deleteOperation(String word1, String word2, int i, int j, int[][] memo) {
	        if (i == word1.length()) {
	            return word2.length() - j;
	        }
	        if (j == word2.length()) {
	            return word1.length() - i;
	        }

	        if (memo[i][j] != -1) {
	            return memo[i][j];
	        }

	        if (word1.charAt(i) == word2.charAt(j)) {
	            memo[i][j] = deleteOperation(word1, word2, i + 1, j + 1, memo);
	        } else {
	            int deleteFromWord1 = deleteOperation(word1, word2, i + 1, j, memo) + 1;
	            int deleteFromWord2 = deleteOperation(word1, word2, i, j + 1, memo) + 1;
	            memo[i][j] = Math.min(deleteFromWord1, deleteFromWord2);
	        }

	        return memo[i][j];
	        //two-dimensional memoization array memo 
	        //to store the minimum number of deletions required at each position (i, j)
	    }

	    public static void main(String[] args) {
	        String word1 = "intention";
	        String word2 = "execution";
	        
	        //minDistance function, and print the minimum number of deletions
	        //required to make the two strings equal.
	        
	        int minDistance = minDistance(word1, word2);
	        System.out.println("Minimum number of deletions: " + minDistance);
	    }
	}
