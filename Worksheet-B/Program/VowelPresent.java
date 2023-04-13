package com.java.WorksheetB;
//Program to check vowel present in a string//
public class VowelPresent {
public static void main(String[] args) {
	String str="Welcome to Flip Robo".toLowerCase();
	boolean isVowelPresent= false;
	for(int i=0; i<str.length(); i++) {
		char character=str.charAt(i);
		if(character == 'a'||character == 'e'||character == 'i'||character == 'o'||character == 'u')
		{
			
			isVowelPresent= true;
			break;
		}
	}
	if(isVowelPresent) {
		System.out.println("The Vowel is present: true \n"+ str);
	}else {
		System.out.println("The Vowel is not present: false");
	}
}
}
