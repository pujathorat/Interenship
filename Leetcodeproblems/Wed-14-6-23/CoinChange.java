package com.java.LeetcodeproblemsMayJune;

	import java.util.Arrays;

	public class CoinChange {

	    public static int coinChange(int[] coins, int amount) {
	        // Create an array 'dp' to store the minimum number of coins required for each amount
	        int[] dp = new int[amount + 1];

	        // Initialize all elements of 'dp' to 'amount + 1'
	        Arrays.fill(dp, amount + 1);

	        // Set the number of coins required for amount 0 to 0
	        dp[0] = 0;

	        // Iterate over each coin denomination
	        for (int coin : coins) {
	            // Iterate from 'coin' to 'amount'
	            for (int i = coin; i <= amount; i++) {
	                // Update 'dp[i]' with the minimum number of coins required
	                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
	            }
	        }

	        // If the minimum number of coins required for 'amount' is greater than 'amount',
	        // it means it's not possible to make the amount using the given coins, so return -1
	        // Otherwise, return the minimum number of coins required for 'amount'
	        return dp[amount] > amount ? -1 : dp[amount];
	    }

	    public static void main(String[] args) {
	        // Example input
	        int[] coins = {1, 2, 5};
	        int amount = 11;

	        // Calculate the minimum number of coins required
	        int minCoins = coinChange(coins, amount);

	        // Check if it's possible to make the amount using the given coins
	        if (minCoins == -1) {
	            System.out.println("It is not possible to make the amount using the given coins.");
	        } else {
	            System.out.println("Minimum number of coins required: " + minCoins);
	        }
	    }
	}

