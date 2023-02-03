package com.java.worksheet2;

import java.util.Scanner;

public class VowelorConson {
	public static void main(String[ ] arg)
	{
	int i=0;
	Scanner sc=new Scanner(System.in); // user input
	System.out.println("Enter a character : "); //value of letter
	char ch=sc.next( ).charAt(0);	 		
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	{
	System.out.println("Entered character "+ch+" is  Vowel"); 
	}
	else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		System.out.println("Entered character "+ch+" is Consonant");
	      else
		System.out.println("Not an alphabet");	//if number is entered	
	}
}