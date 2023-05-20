package com.java.WorksheetB;

//Java Program to find whether a
//no is power of two
class PowerofTwo {
 /* Function to check if x is power of 2*/
 static boolean isPowerOfTwo(int n)
 {
     return (int)(Math.ceil((Math.log(n) / Math.log(2))))
         == (int)(Math.floor(((Math.log(n) / Math.log(2)))));
 }

 // Driver Code
 public static void main(String[] args)
 {
     if (isPowerOfTwo(211))
         System.out.println("Yes it is power of 2");
     else
         System.out.println("No it's not power of 2");

     if (isPowerOfTwo(64))
         System.out.println("Yes it is power of 2");
     else
         System.out.println("No it's not power of 2");
 }
}