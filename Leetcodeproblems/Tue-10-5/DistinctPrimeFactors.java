package com.java.LeetcodeproblemsMayJune;

import java.util.*;

public class DistinctPrimeFactors {

// Function to return an array of prime numbers
static ArrayList<Integer> sieve(int n){
    ArrayList<Integer> prime = new ArrayList<Integer>();
    for(int i = 0; i < n + 1; i++)
    prime.add(0);
    int p = 2;
    while(p * p <= n){
        if(prime.get(p) == 0){
            for (int i = 2 * p; i < n + 1; i += p)
                prime.set(i, 1);
            }
        p += 1;
    }
 
    ArrayList<Integer> allPrimes = new ArrayList<Integer>();
    for (int i = 2; i < n; i++){
    if (prime.get(i) == 0)
        allPrimes.add(i);
    }
    return allPrimes;
}
 
// Function to return distinct
// prime factors from the given array
static ArrayList<Integer> distPrime(ArrayList<Integer> arr,
                            ArrayList<Integer> allPrimes){
 
    // Creating an empty array
    // to store distinct prime factors
    ArrayList<Integer> list1 = new ArrayList<Integer>();
 
    // Iterating through all the
    // prime numbers and check if
    // any of the prime numbers is a
    // factor of the given input array
    for (int i = 0; i < allPrimes.size(); i++){
        for (int j = 0; j < arr.size(); j++){
            if(arr.get(j) % allPrimes.get(i) == 0){
                list1.add(allPrimes.get(i));
                break;
            }
            }
        }
    return list1;
}
 
// Driver code
public static void main(String args[])
{
     
    // Finding prime numbers upto 10000
    // using Sieve of Eratosthenes
    ArrayList<Integer> allPrimes = new ArrayList<Integer>(sieve(10000));
    ArrayList<Integer> arr = new ArrayList<Integer>();
    arr.add(15);
    arr.add(30);
    arr.add(60);
    ArrayList<Integer> ans = new ArrayList<Integer>(distPrime(arr, allPrimes));
    System.out.print("[");
    for(int i = 0; i < ans.size(); i++)
    System.out.print(ans.get(i) + " ");
    System.out.print("]");
}}