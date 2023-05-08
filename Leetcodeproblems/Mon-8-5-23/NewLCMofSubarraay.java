package com.java.LeetcodeproblemsMayJune;

import java.util.*;
public class NewLCMofSubarraay {
    // function to count subarrays with sum K
    public static int getCountSubarraysWithSumK(List<Integer> arr, int K) {
        int n = arr.size();
        int count = 0;
        // iterate through all possible subarrays
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // calculate sum of subarray
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr.get(k);
                }
                // increment count if sum is equal to K
                count += (sum == K ? 1 : 0);
            }
        }
        return count;
    }

   public static void main(String[] args) {
        int k = 6;
        List<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 1, 5));
        // call function and print result
        int ans = getCountSubarraysWithSumK(arr, k);
        System.out.println("Count of subarrays with sum k is " + ans);
    }
}