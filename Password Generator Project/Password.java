package com.java.passwordvalidation;

import java.util.Scanner;
	
public class Password {
		 int passwordConditions;
public String printMessage()
{
    switch (passwordConditions) {

    // Password length should be
    // between 8 to 15 characters
    case 1:
        return ("Password length should be"
                + " between 8 to 15 characters");

    // Password should not contain any space
    case 2:
        return ("Password should not"
                + " contain any space");

    // Password should contain// at least one digit(0-9)
    case 3:
        return ("Password should contain"
                + " at least one digit(0-9)");

    // Password should contain at least
    // one special character ( @, #, %, &, !, $ )
    case 4:
        return ("Password should contain at "
                + "least one special character");

    // Password should contain at least
    // one uppercase letter(A-Z)
    case 5:
        return ("Password should contain at"
                + " least one uppercase letter(A-Z)");

    // Password should contain at least
    // one lowercase letter(a-z)
    case 6:
        return ("Password should contain at"
                + " least one lowercase letter(a-z)");
    }

    return ("");
}
    
public static void main(String[] args) {
	System.out.println("Welcome to SBI ATM");
	Scanner s = new Scanner(System.in);
	String username;
	String password;
	System.out.println("enter username");
	username =s.nextLine();

	System.out.println("username is\n" +  username);
	System.out.println("Enter password");
	password=s.nextLine();
	
	System.out.println("password is\n" +  password);
	System.out.println("password contains length 8 to 15");
	int stringSize= password.length();
	System.out.println("password length is "+ stringSize);
	if ((stringSize >= 8 && stringSize <= 11)) {
		System.out.println("Password is medium");}
		if(stringSize >=12 && stringSize <=14) {
			System.out.println("Password is good");}
		
		
		if(stringSize >=15) {
			System.out.println("Password is very strong");
		}
		else {
			System.out.println("Password is very weak");
			}
	//checking baccess to correct username and password//
		
	if(username.equals("puja") && password.equals("PujaThorat@8766")){
	 System.out.println("Access Granted");
	}
	else {
		System.out.println("Access denied");
		}
}

}