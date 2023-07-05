package com.java.LeetcodeproblemsJuly;


	import java.util.ArrayList;
	import java.util.List;

	public class IPLsubarray {
	    public static List<Integer> max_of_subarrays(int[] arr, int N, int K) {
	        List<Integer> result = new ArrayList<>();
	        
	        for (int i = 0; i <= N - K; i++) {
	            int max = arr[i];
	            
	            for (int j = i + 1; j < i + K; j++) {
	                if (arr[j] > max) {
	                    max = arr[j];
	                }
	            }
	            
	            result.add(max);
	        }
	        
	        return result;
	    }
	    
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5, 6, 7};
	        int N = arr.length;
	        int K = 3;
	        
	        List<Integer> maxList = max_of_subarrays(arr, N, K);
	        System.out.println(maxList);
	    }
	}

