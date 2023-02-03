package com.java.worksheet2;

import java.util.Scanner;

public class Interest {
 public static void main(String args[]) {     
  //creating scanner to get principle, rate and time input from user
Scanner scanner = new Scanner(System.in);
 System.out.println("Please enter principle amount :");
 float amount = scanner.nextFloat();
 System.out.println("Enter time in years : ");
 float time = scanner.nextFloat();
System.out.println("Enter rate annually : ");
float rate = scanner.nextFloat();
float interest = simpleInterest(amount, rate, time);
System.out.println("Simple interest calculated by program is : " + interest);
 }
public static float simpleInterest(float principle, float rate, float time){
float interest = (principle*rate*time)/100;
return interest;
  }
	}
