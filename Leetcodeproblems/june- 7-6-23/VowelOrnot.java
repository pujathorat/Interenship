package com.java.LeetcodeproblemsMayJune;

import java.util.Scanner;

public class VowelOrnot {
 
    public static void main(String[] args) {
        System.out.println("Enter a character:");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        char c = s.charAt(0);
        boolean found = false;
        //Character.isAlphabetic method to check 
        //if the character c is an alphabet character
        //The result is stored in the boolean variable isAlpha
        boolean isAlpha = Character.isAlphabetic(c);
        if (!isAlpha) {
            System.out.println("Enter a Alphabet Character");
            System.exit(0);
            //isAlpha is false, indicating that the input character is not an alphabet character
            //If so, it prints an error message 
            //and terminates the program using System.exit(0).
        }
 
        for (char ch : vowels) {
            if (ch == c) {
                found = true;
                break;
            }
 
        }
        if (found) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
 
}

