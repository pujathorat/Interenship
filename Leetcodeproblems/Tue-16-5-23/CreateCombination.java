package com.java.LeetcodeproblemsMayJune;

	import java.util.ArrayList;
	import java.util.List;

	public class CreateCombination {

	    public static void main(String[] args) {
	        // Test the combinations program
	        String[] elements = {"1", "2", "3","4"};
	        int r = 2;

	        List<List<String>> combinations = generateCombinations(elements, r);

	        // Print the combinations
	        for (List<String> combination : combinations) {
	            System.out.println(combination);
	        }
	    }

	    public static List<List<String>> generateCombinations(String[] elements, int r) {
	        List<List<String>> combinations = new ArrayList<>();
	        List<String> combination = new ArrayList<>();

	        generateCombinations(elements, r, 0, combination, combinations);

	        return combinations;
	    }

	    private static void generateCombinations(String[] elements, int r, int index, List<String> combination,
	            List<List<String>> combinations) {
	        if (combination.size() == r) {
	            combinations.add(new ArrayList<>(combination));
	            return;
	        }

	        for (int i = index; i < elements.length; i++) {
	            combination.add(elements[i]);
	            generateCombinations(elements, r, i + 1, combination, combinations);
	            combination.remove(combination.size() - 1);
	        }
	    }
	}
