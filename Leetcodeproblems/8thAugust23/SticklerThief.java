package com.java.julymonth;

public class SticklerThief {
	    public static int maxMoney(int[] a, int n) {
	        if (n == 0) {
	            return 0;
	        } else if (n == 1) {
	            return a[0];
	        } else if (n == 2) {
	            return Math.max(a[0], a[1]);
	        }
	        
	        int[] dp = new int[n];
	        dp[0] = a[0];
	        dp[1] = Math.max(a[0], a[1]);
	        
	        for (int i = 2; i < n; i++) {
	            // At each house, the thief can choose to loot the current house or skip it
	            // If he chooses to loot the current house, he adds the money from the current house
	            // and the money looted from the house two steps back, since he cannot loot consecutive houses
	            // If he chooses to skip the current house, he keeps the maximum money obtained so far
	            dp[i] = Math.max(a[i] + dp[i - 2], dp[i - 1]);
	        }
	        
	        return dp[n - 1];
	    }

	    public static void main(String[] args) {
	        int[] a = {5, 5, 10, 100, 10, 5};
	        int n = 6;

	        int result = maxMoney(a, n);
	        System.out.println("Output: " + result);
	    }
	}
