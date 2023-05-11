package com.java.LeetcodeproblemsMayJune;

import java.util.Arrays;

public class MaximumLengthString {
 
  // Recursive function to find the
  // maximum length of the resultant string
  static int maxsum(String S[], int N, int i, int[] dp)
  {
 
    // If index gets out of bound return 0
    if (i >= N)
      return 0;
 
    // If value not already computed
    // then compute it
    if (dp[i] == -1) {
 
      // To include the current string
      int op1 = S[i].length()
        + maxsum(S, N,
                 (i + S[i].length() / 2)
                 + 1,
                 dp);
 
      // To exclude the current string
      int op2 = maxsum(S, N, i + 1, dp);
 
      // Maximum of both the options
      dp[i] = Math.max(op1, op2);
    }
    return dp[i];
  }
 
  // Driver Code
  public static void main(String args[]) {
    String S[] = { "happy", "for", "your", "birthday", "bestii" };
    int N = S.length;
    int[] dp = new int[N];
    Arrays.fill(dp, -1);
    System.out.println(maxsum(S, N, 0, dp));
  }
}