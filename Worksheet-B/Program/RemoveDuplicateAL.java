package com.java.WorksheetB;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateAL {   
    public static void main(String[] args) {  
        List<String> l = new ArrayList<String>();  
       
        l.add("T.V.");  
        l.add("Bulb");
        l.add("Washing Machine");
        l.add("Tube");  
        l.add("Washing Machine");
        l.add("T.V.");
        System.out.println(l.toString());  
        Set<String> s = new LinkedHashSet<String>(l); 
        System.out.println("After removing duplicate List is:");
        System.out.println(s);  
    }  
}  
