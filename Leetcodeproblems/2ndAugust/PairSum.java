package com.java.julymonth;

	import java.util.HashMap;
	import java.util.Map;

	public class PairSum {
	    public static int countPairsWithSum(int[] arr, int N, int K) {
	        // Initialize a HashMap to store the frequency of each element in the array
	        Map<Integer, Integer> frequencyMap = new HashMap<>();
	        int count = 0;

	        // Traverse the array and store the frequency of each element in the HashMap
	        for (int i = 0; i < N; i++) {
	            int currentElement = arr[i];
	            frequencyMap.put(currentElement, frequencyMap.getOrDefault(currentElement, 0) + 1);
	        }

	        // Traverse the array again to find pairs whose sum is equal to K
	        for (int i = 0; i < N; i++) {
	            int currentElement = arr[i];
	            int target = K - currentElement;

	            // If target exists in the array and it is not the same element as currentElement
	            if (frequencyMap.containsKey(target)) {
	                int frequency = frequencyMap.get(target);

	                // If the target element is the same as currentElement, we need at least two occurrences of it
	                if (target == currentElement) {
	                    count += (frequency - 1);
	                } else {
	                    count += frequency;
	                }
	            }
	        }

	        // Since each pair is counted twice (for example, both (a, b) and (b, a)), we divide by 2
	        return count / 2;
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 5, 7, 1};
	        int N = 4;
	        int K = 6;

	        int result = countPairsWithSum(arr, N, K);
	        System.out.println("Output: " + result);
	    }
	}

