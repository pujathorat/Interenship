package com.java.LeetcodeproblemsMayJune;

import java.util.*;

public class Print2DArray { 
  
    public static void convertToString(int arr[][]) 
    { 

        for (int n = 0 ; n < arr.length ; n++)
        {
            System.out.println(Arrays.toString(arr[n])); 
        } 
            
    } 
  
    public static void main(String args[])
    { 
        int arr[][] = { { 23, 70, 39 }, 
                        { 51, 64, 47 }, 
                        { 81, 11, 105 } }; 
        convertToString(arr); 
    } 
} 