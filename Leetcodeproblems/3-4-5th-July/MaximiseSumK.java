package com.java.LeetcodeproblemsJuly;


	import java.util.Arrays;

	public class MaximiseSumK {
		//getMaxSum method takes the array arr, 
		//its size N, and the number of operations K as inputs. 
		    public static int getMaxSum(int[] arr, int N, int K) {
		        int sum = 0;

		        for (int i = 0; i < N; i++) {
		            if (arr[i] < 0 && K > 0) {
		                arr[i] = -arr[i];
		                K--;
		            }

		            sum += arr[i];
		        }

		        if (K % 2 == 1) {
		            int min = Integer.MAX_VALUE;
		            for (int i = 0; i < N; i++) {
		                min = Math.min(min, arr[i]);
		            }
		            sum -= 2 * min;
		        }

		        return sum;
		    }

		    public static void main(String[] args) {
		        int N = 10;
		        int K = 5;
		        int[] arr = {5, -2, 5, -4, 5, -12, 5, 5, 5, 20};

		        int maxSum = getMaxSum(arr, N, K);
		        System.out.println(maxSum);
		    }
		}
