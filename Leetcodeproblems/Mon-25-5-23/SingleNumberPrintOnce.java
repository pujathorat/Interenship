package com.java.LeetcodeproblemsMayJune;

public class SingleNumberPrintOnce {

    public static int findSingleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;  // XOR operation
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1}; // given array
        int singleNumber = findSingleNumber(nums);
        System.out.println("The single number is: " + singleNumber);
    }
}
