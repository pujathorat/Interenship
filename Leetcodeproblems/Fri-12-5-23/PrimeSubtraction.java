package com.java.LeetcodeproblemsMayJune;
public class PrimeSubtraction {
    
    public static void main(String[] args) {
        int[] nums= {6,8,11,12};
        
        boolean result = primeSubOperation(nums);
        
        System.out.println("Result: " + result);
    }
    
    public static boolean primeSubOperation(int[] nums) {
        int n = nums.length;

    // Step 1: Iterate through the array in reverse
    for (int i = n - 2; i >= 0; i--) {
        int num = nums[i];

        // Step 2: If nums[i] >= nums[i+1], subtract a prime number from nums[i] to make it less than nums[i+1]
        if (num >= nums[i + 1]) {
            int guess = nums[i + 1] - 1;
            int diff = num - guess;

            // Find a prime number to subtract
            while (!isPrime(diff)) {
                if (guess < i + 1) return false;
                guess--;
                diff++;
            }

            // If it's not possible to find a suitable prime, return false
            if (guess < i + 1) return false;
            nums[i] = guess;
        }
    }

    // Step 4: Check if the updated nums array is strictly increasing
    return true;
    }
// Helper function to check if a number is prime
    private static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        int left = 2;
        int right = num /2 + 1;
        while (left <= right) {
            if (num % left == 0) return false;
            left++;
            right = num / left + 1;
        }
        return true;
    }
}