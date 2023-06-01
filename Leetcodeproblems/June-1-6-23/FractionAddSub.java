package com.java.LeetcodeproblemsMayJune;


	import java.io.*;
	import java.util.Scanner;
	public class FractionAddSub {
	    public static void main(String args[])
	    {
	        double n1,d1,n2,d2,x,y,res = 0;
	        Scanner input = new Scanner(System.in);
	        System.out.println("\nEnter the numerator for 1st fraction : ");
	        n1 = input.nextDouble();
	        System.out.println("\nEnter the denominator for 1st fraction : ");
	        d1 = input.nextDouble();
	        System.out.println("\nEnter the numerator for 2nd fraction : ");
	        n2 = input.nextDouble();
	        System.out.println("\nEnter the denominator for 2nd fraction : ");
	        d2 = input.nextDouble();
	        x=(n1*d2)-(n2*d1); //numerator
	        y=d1*d2; //denominator
	        x=(n1*d2)+(n2*d1); //numerator
	        y=d1*d2; //denominator
	        res=x/y;// addition subtraction fraction
	        System.out.println("\nThe addition fraction is :"+ res);
	        System.out.println();
	        
	        System.out.println("\nThe subtraction fraction is "+ res);
	        System.out.println();
	        
	        res=n1/d1;          //fraction
	        System.out.println("\nThe fraction is :"+ res);
	        System.out.println();
	    }
	}

