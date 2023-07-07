package com.java.LeetcodeproblemsJuly;

	import java.util.ArrayList;
	import java.util.List;

	public class GenerateIPAdrs {
	    public static List<String> genIp(String s) {
	        List<String> result = new ArrayList<>();
	        if (s.length() < 4 || s.length() > 12) {
	            return result;
	        }
	        backtrack(result, new ArrayList<>(), s, 0);
	        return result;
	    }

	    private static void backtrack(List<String> result, List<String> current, String s, int start) {
	        if (current.size() == 4 && start == s.length()) {
	            result.add(String.join(".", current));
	            return;
	        }
	        for (int i = 1; i <= 3; i++) {
	            if (start + i > s.length()) {
	                break;
	            }
	            String segment = s.substring(start, start + i);
	            if (isValidSegment(segment)) {
	                current.add(segment);
	                backtrack(result, current, s, start + i);
	                current.remove(current.size() - 1);
	            }
	        }
	    }

	    private static boolean isValidSegment(String segment) {
	        if (segment.startsWith("0") && segment.length() > 1) {
	            return false;
	        }
	        int num = Integer.parseInt(segment);
	        return num >= 0 && num <= 255;
	    }

	    public static void main(String[] args) {
	        String s = "11211";
	        List<String> ipAddresses = genIp(s);
	        System.out.println(ipAddresses);
	    }
	}

