package com.java.Leetcodeproblems;

	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.List;
//Iterator interface provides a way to iterate over elements in a collection
	public class JavaIterator {
	    public static void main(String[] args) {
	        List<String> electricitems = new ArrayList<>();
	        electricitems.add("Television");
	        
	        electricitems.add("Refrigerator");
	        electricitems.add("Fans");

	        // Create an iterator for the list
	        Iterator<String> iterator = electricitems.iterator();

	        // Iterate over the elements using the iterator
	        while (iterator.hasNext()) {
	            String electricitem = iterator.next();
	            System.out.println(electricitem);
	        }
	    }
	}
