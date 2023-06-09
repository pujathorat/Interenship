package com.java.LeetcodeproblemsMayJune;

	import java.util.Calendar;
	import java.util.Date;
	import java.util.Scanner;

	public class DayandDate {
	    public static void main(String[] args) {
	        // Create a Scanner object to read input from the user
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a date
	        System.out.print("Enter a date (format: yyyy-mm-dd): ");
	        String inputDate = scanner.nextLine();

	        // Parse the input date
	        Date date = parseDate(inputDate);

	        if (date != null) {
	            // Create a Calendar object and set the parsed date
	            Calendar calendar = Calendar.getInstance();
	            calendar.setTime(date);

	            // Get the day of the week (Sunday = 1, Monday = 2, ..., Saturday = 7)
	            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

	            // Convert the day of the week to a string representation
	            String dayOfWeekString = getDayOfWeekString(dayOfWeek);

	            // Print the day of the week
	            System.out.println("The day of the week for " + inputDate + " is: " + dayOfWeekString);
	        } else {
	            System.out.println("Invalid date format!");
	        }

	        // Close the scanner
	        scanner.close();
	    }

	    // Helper method to parse the input date
	    private static Date parseDate(String inputDate) {
	        try {
	            // Create a Date object from the input string
	            return java.sql.Date.valueOf(inputDate);
	        } catch (IllegalArgumentException e) {
	            return null;
	        }
	    }

	    // Helper method to get the string representation of the day of the week
	    private static String getDayOfWeekString(int dayOfWeek) {
	        switch (dayOfWeek) {
	            case Calendar.SUNDAY:
	                return "Sunday";
	            case Calendar.MONDAY:
	                return "Monday";
	            case Calendar.TUESDAY:
	                return "Tuesday";
	            case Calendar.WEDNESDAY:
	                return "Wednesday";
	            case Calendar.THURSDAY:
	                return "Thursday";
	            case Calendar.FRIDAY:
	                return "Friday";
	            case Calendar.SATURDAY:
	                return "Saturday";
	            default:
	                return "Invalid day";
	        }
	    }
	}
