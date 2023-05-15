package com.java.LeetcodeproblemsMayJune;

import java.util.ArrayList;
import java.util.List;
public class PermutationSequence {
    public static String getPermutation(int n, int k) {
        // Create a list of numbers from 1 to n
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }

        // Calculate the factorial of n
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }

        // Convert k to 0-based index
        k--;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            factorial /= (n - i);
            int index = k / factorial;
            sb.append(nums.get(index));
            nums.remove(index);
            k -= index * factorial;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int n = 3;
        int k = 4;
        String permutation = getPermutation(n, k);
        System.out.println("The " + k + "th permutation sequence is: " + permutation);
    }
}
