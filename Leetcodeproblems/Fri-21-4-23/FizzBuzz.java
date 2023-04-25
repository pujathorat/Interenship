package com.java.Leetcodeproblems;

//Java program to print Fizz Buzz
import java.util.*;
class FizzBuzz
{
 public static void main(String[] args)
 {
     int n = 15;

     // loop for n times
     for (int i=1; i<=n; i++)                                
     {
         //divisible by both 3 & 5 print 'FizzBuzz' in
         // place of the number
    	// number divisible by 5, print 'Buzz'
         // in place of the number
          if (i%5==0)    
             System.out.println("Buzz");

         // number divisible by 3, print 'Fizz'
         // in place of the number
         else if (i%3==0)    
             System.out.println("Fizz");
              
         else // print the numbers
             System.out.println(i);                        
     }
 }
}