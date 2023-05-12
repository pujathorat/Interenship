package com.java.Leetcodeproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


	public class Mergearrayaddsum {
	    public int[][] findSum(int[][] nums1, int[][] nums2) {
	        Map<Integer, Integer> sumMap = new HashMap<>();

	        // Iterate through nums1 and add values to the map
	        for (int[] pair : nums1) {
	            int id = pair[0];
	            int value = pair[1];
	            sumMap.put(id, sumMap.getOrDefault(id, 0) + value);
	        }

	        // Iterate through nums2 and add values to the map
	        for (int[] pair : nums2) {
	            int id = pair[0];
	            int value = pair[1];
	            sumMap.put(id, sumMap.getOrDefault(id, 0) + value);
	        }

	        // Create result ArrayList and add entries from the map
	        List<int[]> result = new ArrayList<>();
	        for (Map.Entry<Integer, Integer> entry : sumMap.entrySet()) {
	            int id = entry.getKey();
	            int sum = entry.getValue();
	            result.add(new int[]{id, sum});
	        }

	        // Convert result ArrayList to a 2D array
	        int[][] output = new int[result.size()][2];
	        for (int i = 0; i < result.size(); i++) {
	            output[i] = result.get(i);
	        }

	        return output;
	    }

	    public static void main(String[] args) {
	        int[][] nums1 = {{1, 2}, {2, 3}, {4, 5}};
	        int[][] nums2 = {{1, 4}, {3, 2}, {4, 1}};

	        Mergearrayaddsum arraySum = new Mergearrayaddsum();
	        int[][] result = arraySum.findSum(nums1, nums2);

	        // Print the result
	        for (int[] pair : result) {
	            System.out.println(Arrays.toString(pair));
	        }
	    }
	}
