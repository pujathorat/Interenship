package com.java.passwordvalidation;

import java.security.SecureRandom;

public class PasswordGenerator {
    public static void main(String[] args) {
        String passwordAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";
        int passwordLength = 8 + (int)(Math.random() * 9); // generate a random length between 8 and 16
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < passwordLength; i++) {
            int index = random.nextInt(passwordAlphabet.length());
            password.append(passwordAlphabet.charAt(index));
        }
        System.out.println("Generated Password: " + password.toString());
        System.out.println("Password Length: " + passwordLength);
        String password1 = "Generated Password + password.toString()"; // replace this with the generated password
        int password1Length = password1.length();
        boolean hasUppercase = !password1.equals(password1.toLowerCase());
        boolean hasLowercase = !password1.equals(password1.toUpperCase());
        boolean hasNumber = password1.matches(".*\\d.*");
        boolean hasSymbol = password1.matches(".*[!@#$%^&*()_+].*");
        
        String strength= " ";
        	
if (passwordLength >= 8 && passwordLength <= 16 &&
                hasUppercase && hasLowercase && hasNumber && hasSymbol) {
            strength = "Very Strong";
        } else if (passwordLength >= 8 && passwordLength <= 16 &&
                ((hasUppercase && hasLowercase && hasNumber) || (hasUppercase && hasLowercase && hasSymbol) ||
                (hasUppercase && hasNumber && hasSymbol) || (hasLowercase && hasNumber && hasSymbol))) {
            strength = "Strong";
        } else if (passwordLength >= 8 && passwordLength <= 16 &&
                ((hasUppercase && hasLowercase) || (hasUppercase && hasNumber) || (hasUppercase && hasSymbol) ||
                (hasLowercase && hasNumber) || (hasLowercase && hasSymbol) || (hasNumber && hasSymbol))) {
            strength = "Medium";
        } else if (passwordLength >= 8 && passwordLength <= 16) {
            strength = "Weak";
        } else {
            strength = "Very Weak";
        }
        System.out.println("Password Strength: " + strength);
}}
