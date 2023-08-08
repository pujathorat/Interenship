package com.java.julymonth;


	import java.util.*;

	public class AlienDictionary {
	    
	    // Helper function to add edges to the graph
	    private static void addEdge(Map<Character, List<Character>> graph, char from, char to) {
	        if (!graph.containsKey(from)) {
	            graph.put(from, new ArrayList<>());
	        }
	        graph.get(from).add(to);
	    }
	    
	    // DFS function to perform topological sorting
	    private static void dfs(char curr, Map<Character, List<Character>> graph, Set<Character> visited, Stack<Character> stack) {
	        visited.add(curr);
	        if (graph.containsKey(curr)) {
	            for (char neighbor : graph.get(curr)) {
	                if (!visited.contains(neighbor)) {
	                    dfs(neighbor, graph, visited, stack);
	                }
	            }
	        }
	        stack.push(curr);
	    }
	    
	    // Main function to find the order of characters
	    public static String findAlienOrder(String[] words, int N, int K) {
	        Map<Character, List<Character>> graph = new HashMap<>();
	        
	        // Initialize the graph based on adjacent words
	        for (int i = 0; i < N - 1; i++) {
	            String word1 = words[i];
	            String word2 = words[i + 1];
	            for (int j = 0; j < Math.min(word1.length(), word2.length()); j++) {
	                if (word1.charAt(j) != word2.charAt(j)) {
	                    addEdge(graph, word1.charAt(j), word2.charAt(j));
	                    break;
	                }
	            }
	        }
	        
	        // Perform topological sorting using DFS
	        Set<Character> visited = new HashSet<>();
	        Stack<Character> stack = new Stack<>();
	        for (char ch : graph.keySet()) {
	            if (!visited.contains(ch)) {
	                dfs(ch, graph, visited, stack);
	            }
	        }
	        
	        // Build the final order string
	        StringBuilder order = new StringBuilder();
	        while (!stack.isEmpty()) {
	            order.append(stack.pop());
	        }
	        
	        return order.toString();
	    }

	    public static void main(String[] args) {
	        int N = 5;
	        int K = 4;
	        String[] dict = {"baa", "abcd", "abca", "cab", "cad"};
	        
	        String result = findAlienOrder(dict, N, K);
	        System.out.println(result);
	    }
	}
