package com.java.passwordvalidation;

import java.util.Random;
import java.util.Scanner;

public class RandomStringPassword {
public static void main(String[] args) {
	String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String Lower="abcdefghijklmnopqrstuvwxyz";
	String num="012345678910";
	String specialChars="<>,.?/[}{]+-*&$%@#!()=''";
	String combination= upper+Lower+specialChars+num;
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the length for password:");
	int len=s.nextInt();
	
	char[] password=new char[len];
	Random r=new Random();
	
	
	for(int i=0; i<len; i++) {
		
		password[i]=combination.charAt(r.nextInt(combination.length()));
	}
	System.out.println("Generated Password is:" +new String(password));
	if(password.length<8) {
		System.out.println("weak password");
	}
	if( password.length<16 && password.length>=8) {
		System.out.println("Good password");
	}
	else if (password.length>=16){
		System.out.println("strong password");
	}
	 }}
