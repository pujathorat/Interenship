package com.java.LeetcodeproblemsMayJune;

	// Java program to demonstrate set() Method of ArrayList
	
	 
	// Importing required classes
	import java.io.*;
	import java.util.*;
	 
	// Main class

	public class ReplacingElementinArray { 
	  // Main driver method
	  public static void main(String[] args) {
	 
	 
	      // Creating an object of Arraylist class
	      ArrayList<String> list = new ArrayList<>();
	 
	 
	      // Adding elements to the List
	      // using add() method
	 
	      // Custom input elements
	      list.add("2");
	      list.add("4");
	      list.add("8");
	      list.add("6");
	 
	      // Print all the elements added in the above object
	      System.out.println("Array of given element is:");
	      System.out.println(list);
	 
	      // 2 is the index of the element "8".
	      //"8" will be replaced by "10"
	      list.set(2, "10");
	 
	      // Printing the newly updated List
	      System.out.println("Array after replacing element is:");
	      System.out.println(list);
	 
	    }}
