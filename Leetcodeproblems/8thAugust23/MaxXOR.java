package com.java.julymonth;


	class TrieNode {
	    TrieNode[] children;
	    
	    TrieNode() {
	        children = new TrieNode[2];
	    }
	}
	public class MaxXOR {
	    static TrieNode root;
	    
	    static void insert(int num) {
	        TrieNode node = root;
	        for (int i = 31; i >= 0; i--) {
	            int bit = (num >> i) & 1;
	            if (node.children[bit] == null) {
	                node.children[bit] = new TrieNode();
	            }
	            node = node.children[bit];
	        }
	    }
	    
	    static int findMaxXOR(int num) {
	        TrieNode node = root;
	        int maxXOR = 0;
	        for (int i = 31; i >= 0; i--) {
	            int bit = (num >> i) & 1;
	            int complementBit = 1 - bit;
	            
	            if (node.children[complementBit] != null) {
	                maxXOR |= (complementBit << i);
	                node = node.children[complementBit];
	            } else {
	                node = node.children[bit];
	            }
	        }
	        return maxXOR;
	    }
	    
	    static int findMaximumXOR(int[] arr) {
	        root = new TrieNode();
	        for (int num : arr) {
	            insert(num);
	        }
	        
	        int maxXOR = Integer.MIN_VALUE;
	        for (int num : arr) {
	            maxXOR = Math.max(maxXOR, findMaxXOR(num));
	        }
	        return maxXOR;
	    }
	    
	    public static void main(String[] args) {
	        int[] arr = {2, 4, 5};
	        int result = findMaximumXOR(arr);
	        System.out.println("Maximum XOR subset value: " + result);
	    }
	}

