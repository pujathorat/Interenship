package com.java.LeetcodeproblemsMayJune;

	import java.util.Date;
	import java.text.DateFormat;
	import java.text.SimpleDateFormat;

	public class DayandDateNew {
	    public static void main(String[] args) {
	        // Get the current date and time
	        Date currentDate = new Date();

	        // Create a date format object
	        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

	        // Format the date as a string
	        String dateString = dateFormat.format(currentDate);

	        // Print the current date
	        System.out.println("Current Date: " + dateString);

	        // Create a date format object for day of the week
	        DateFormat dayFormat = new SimpleDateFormat("EEEE");

	        // Format the day of the week as a string
	        String dayOfWeek = dayFormat.format(currentDate);

	        // Print the current day
	        System.out.println("Current Day: " + dayOfWeek);
	    }
	}

