package com.java.julymonth;

import java.util.Arrays;

public class CandyAllocation {
	    public static int allocateCandies(int N, int[] ratings) {
	        int[] candies = new int[N];

	        // Initialize all candies with 1
	        Arrays.fill(candies, 1);

	        // Traverse from left to right and update candies based on ratings
	        for (int i = 1; i < N; i++) {
	            if (ratings[i] > ratings[i - 1]) {
	                candies[i] = candies[i - 1] + 1;
	            }
	        }

	        // Traverse from right to left and update candies based on ratings
	        for (int i = N - 2; i >= 0; i--) {
	            if (ratings[i] > ratings[i + 1] && candies[i] <= candies[i + 1]) {
	                candies[i] = candies[i + 1] + 1;
	            }
	        }

	        // Calculate the total number of candies
	        int totalCandies = 0;
	        for (int candy : candies) {
	            totalCandies += candy;
	        }

	        return totalCandies;
	    }

	    public static void main(String[] args) {
	        int N = 3;
	        int[] ratings = {1, 0, 2};
	        int output = allocateCandies(N, ratings);
	        System.out.println(output); 
	    }
	}

