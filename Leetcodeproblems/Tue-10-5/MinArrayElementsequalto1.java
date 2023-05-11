package com.java.LeetcodeproblemsMayJune;

import java.io.*;

public class MinArrayElementsequalto1 {
         
    // Function to return the minimum number of
    // given operation required to make all the
    // array elements equal
    static void minOperation(int n, int k, int a[])
    {
         
        // Check if all the elements
        // from kth index to last are equal
        for (int i = k; i < n; i++)
        {
            if(a[i] != a[k - 1])
                System.out.println(-1);
        }
         
        // Finding the 1st element which is
        // not equal to the kth element
        for (int i = k - 2; i > -1; i--)
        {
            if(a[i] != a[k - 1])
                System.out.println(i + 1);
        }
    }
 
    // Driver code
    public static void main (String[] args)
    {
     
        int n = 5;
        int k = 3;
        int a[] = {2, 1, 1, 1, 1};
         
        minOperation(n, k, a);
    }
}
 