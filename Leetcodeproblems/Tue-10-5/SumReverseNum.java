package com.java.LeetcodeproblemsMayJune;

import java.util.Scanner;

public class SumReverseNum {
	public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String n2s="";
        
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        System.out.println("Enter the value of n1:");
        int n1= sc.nextInt();
        
        
        String n1s= String.valueOf(n1/2); //let n1s be the String of n1
        for (int i=1;i<=n1s.length();i++){
            n2s+=n1s.charAt(n1s.length()-i); 
        }
        System.out.println(n2s);
        int n2=Integer.valueOf(n2s);
        int adit=n1+n2;
        System.out.println(n1s+" + "+n2s +" = "+ adit);
        System.out.println(adit);
if (n==adit) {
	System.out.println(true);
}
else
		System.out.println(false);
}}