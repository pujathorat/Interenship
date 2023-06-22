package com.java.LeetcodeproblemsMayJune;

public class EditDistance {
	//calculateDistance method takes two input strings, word1 and word2, 
	//and returns the minimum edit distance between them.
	    public static int calculateEditDistance(String word1, String word2) {
	        int m = word1.length();
	        int n = word2.length();
//2D array called dp to store the dynamic programming table
	        int[][] dp = new int[m + 1][n + 1];

	        for (int i = 0; i <= m; i++) {
	            dp[i][0] = i;
	        }

	        for (int j = 0; j <= n; j++) {
	            dp[0][j] = j;
	        }
// initialize the first row of dp with values from 0 to word2.length() 
	        //to represent the minimum number of operations 
	        //required to convert word1 to an empty string.
	        for (int i = 1; i <= m; i++) {
	            for (int j = 1; j <= n; j++) {
	                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
	                    dp[i][j] = dp[i - 1][j - 1];
	                } else {
	                    int insert = dp[i][j - 1] + 1;
	                    int delete = dp[i - 1][j] + 1;
	                    int replace = dp[i - 1][j - 1] + 1;
	                    dp[i][j] = Math.min(insert, Math.min(delete, replace));
	                }
	            }
	        }
	        //If the characters are different, we take the minimum value 
	        //from three neighboring cells (dp[i-1][j], dp[i][j-1], 
	        //and dp[i-1][j-1]) and add 1 to it, representing the 
	        //cost of the current operation

	        return dp[m][n];
	        //we return the value in the bottom-right cell of dp,
	        //which represents the minimum edit distance between the two input strings.
	    }

	    public static void main(String[] args) {
	        String word1 = "kitten";
	        String word2 = "sitting";

	        int editDistance = calculateEditDistance(word1, word2);
	        System.out.println("Edit Distance: " + editDistance);
	        //We call the calculateDistance method with word1 and word2
	        //as arguments to get the edit distance.
	    }
	}

