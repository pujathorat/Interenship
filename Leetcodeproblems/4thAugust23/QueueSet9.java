package com.java.julymonth;

import java.util.*;

public class QueueSet9 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the standard input stream (System.in).
        Scanner sc = new Scanner(System.in);

        // Read the number of test cases (T) from the input.
        int t = sc.nextInt();

        // Start a loop to iterate over each test case.
        while (t-- > 0) {
            // Read the number of queries (Q) for each test case.
            int q = sc.nextInt();

            // Create a queue using the LinkedList implementation for each test case.
            Queue<Integer> queue = new LinkedList<>();

            // Create a StringBuilder to store the results of the queries for each test case.
            StringBuilder result = new StringBuilder();

            // Start another loop to process each query for the current test case.
            while (q-- > 0) {
                // Read the next query (operation) from the input.
                String operation = sc.next();

                // Use a switch statement to handle different types of queries.
                switch (operation) {
                    case "a": // Pushes an element x at the end of the queue.
                        int x = sc.nextInt();
                        queue.add(x);
                        break;

                    case "r": // Pops the front element and prints it (or prints -1 if the queue is empty).
                        if (!queue.isEmpty()) {
                            result.append(queue.poll()).append(" ");
                        } else {
                            result.append("-1").append(" ");
                        }
                        break;

                    case "s": // Prints the size of the queue.
                        result.append(queue.size()).append(" ");
                        break;

                    case "p": // Prints the front element of the queue (or prints -1 if the queue is empty).
                        if (!queue.isEmpty()) {
                            result.append(queue.peek()).append(" ");
                        } else {
                            result.append("-1").append(" ");
                        }
                        break;
                }
            }

            // Print the results of the queries for the current test case.
            System.out.println(result.toString().trim());
        }
    }
}
