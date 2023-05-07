package com.java.LeetcodeproblemsMayJune;

public class BalancedbracketString {

//Java Program to find minimum number of '(' or ')'
//must be added to make Parentheses string valid.
 // Function to return required minimum number
 static int minParentheses(String p)
 {
    
     // maintain balance of string
     int bal = 0;
     int ans = 0;
    
     for (int i = 0; i < p.length(); ++i) {
    
         bal += p.charAt(i) == '(' ? 1 : -1 ;
    
         // It is guaranteed bal >= -1
         if (bal == -1) {
             ans += 1;
             bal += 1;
         }
     }
    
     return bal + ans;
 }
  
 public static void main(String args[])
 {
     String p = "())";
      
     // Function to print required answer
     System.out.println(minParentheses(p));
    
 }}