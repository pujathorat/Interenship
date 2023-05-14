package com.java.LeetcodeproblemsMayJune;
	// Java program to visualize the Car
	  
	// A class Car
public class FunctionCall {
	    // A method examStart() which
	    // simply starts the exam
	    public static void examStart()
	    {
	        System.out.println("Exam Started!");
	    }
	  
	    // A method studyStart() which starts
	    // the study and preparation for exam
	    public static void studyStart()
	    {
	        // Calling the function
	        // examStart() inside the
	        // definition of function
	        // studyStart()
	        examStart();
	        // Finally, the study is
	        // started for exam
	        System.out.println("Study Started!");
	    }
	  
	    public static void main(String[] args)
	    {
	  
	        studyStart();
	  
	        // When the study is started,
	        // we are ready to give exam
	        System.out.println("Let's enjoy exam time!");
	    }
	}
