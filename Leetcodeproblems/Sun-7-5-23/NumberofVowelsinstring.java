package com.java.LeetcodeproblemsMayJune;

//Java implementation of the above approach
import java.io.*;
import java.util.*;
public class NumberofVowelsinstring {
 // Returns the total sum of
 // occurrences of all vowels
 static int vowel_calc(String s)
 {
     int n = s.length();
     int arr[] = new int[n];

     for (int i = 0; i < n; i++) {

         if (i == 0)
             // No. of occurrences of 0th character
             // in all the substrings
             arr[i] = n;

         else
             // No. of occurrences of ith character
             // in all the substrings
             arr[i] = (n - i) + arr[i - 1] - i;
     }

     int sum = 0;
     for (int i = 0; i < n; i++) {
         char ch = s.charAt(i);
         // Check if ith character is a vowel
         if (ch == 'a' || ch == 'e' || ch == 'i'
             || ch == 'o' || ch == 'u')
             sum += arr[i];
     }

     // Return the total sum
     // of occurrences of vowels
     return sum;
 }

 // Driver Code
 public static void main(String args[])
 {
     String s = "daceh";
     System.out.println(vowel_calc(s));
 }
}