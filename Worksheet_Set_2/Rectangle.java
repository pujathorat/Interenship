package com.java.worksheet2;

import java.util.Scanner;
public class Rectangle {
public static void main(String[] args) {
//input from user
Scanner input=new Scanner(System.in);
System.out.println("Enter length of the rectangle:");
int l= input.nextInt();  // length of rectangle
System.out.println("Enter breadth of the rectangle:");
int b=input.nextInt();   //breadth of rectangle

//Area of rectangle
int A=l*b;         
System.out.println("Area of rectangle is:" + A);

//Perimeter of rectangle
int p=2*(l+b);
System.out.println("Perimeter of the rectangle is:"  + p);
}}