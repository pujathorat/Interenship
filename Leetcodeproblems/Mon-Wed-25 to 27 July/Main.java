package com.java.inheritance;

import java.util.Scanner;

class cls1 {
	//This class acts as a base class or super class for other classes in the program.
    void add(int p, int q) {
        System.out.println(p + q);
     //This line defines a method add within the cls1 class. 
    //The method takes two parameters p and q,
    //and it does not return anything (void).
    }
}

class cls2 extends cls1 {
    void mul(int p, int q) {
  //This line defines a method called mul within the cls2 class. 
 //The method takes two integer parameters p and q and prints their product
        System.out.println(p * q);
    }

    void task(int a, int b) {
 //This line defines a method called task within the cls2 class. 
  //The method takes two integer parameters a and b
        int sumOfSquares = (a * a) + (b * b);
 //This line calculates the sum of squares of the values a and b 
//and stores it in the variable sumOfSquares
        System.out.println(sumOfSquares);
    }
}

public class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of T:");
        int T = sc.nextInt();
        
        for (int t = 0; t < T; t++) {
 //This line starts a for loop that will run T times, 
 //where t is the loop variable starting from 0.
        	 System.out.println("Enter a:");
            int a = sc.nextInt();
            System.out.println("Enter b:");
            int b = sc.nextInt();
            cls2 obj = new cls2();
 //This line calls the add method of the cls2 class, 
 //which is inherited from the cls1 class,
 //passing a and b as arguments. It will print their sum.
            System.out.println("Sum of a & b:");
            obj.add(a, b);
 //it will add a & b
            System.out.println("Product of a & b:");
            obj.mul(a, b);
 //it will print product of a & b
            System.out.println("sum of squares:");
            obj.task(a, b);
 //It will calculate the sum of squares and print the result.
        }
    }
}


