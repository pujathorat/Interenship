package com.java.LeetcodeproblemsMayJune;


	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.security.MessageDigest;
	import java.security.NoSuchAlgorithmException;
	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;

	//To find duplicate files in a system using Java,
	//we can use a combination of file traversal and hashing techniques.
	public class DuplicateStringFile {

	    public static void main(String[] args) {
	        String directoryPath = "C:\\Users\\USER\\eclipse-workspace\\com.java.Leetcodeproblems\\src\\com\\java\\Leetcodeproblems";    // Specify the directory path to search for duplicate files
	        List<List<String>> duplicateFiles = findDuplicateFiles(directoryPath);

	        if (duplicateFiles.isEmpty()) {
	            System.out.println("No duplicate files found.");
	        } else {
	            System.out.println("Duplicate files found:");
	            for (List<String> fileList : duplicateFiles) {
	                System.out.println("Duplicate Files:");
	                for (String filePath : fileList) {
	                    System.out.println(filePath);
	                }
	                System.out.println();
	            }
	        }
	    }

	    public static List<List<String>> findDuplicateFiles(String directoryPath) {
	        List<List<String>> duplicateFiles = new ArrayList<>();
	        Map<String, List<String>> fileHashes = new HashMap<>();

	        File root = new File(directoryPath);
	        if (!root.isDirectory()) {
	            System.out.println("Invalid directory path.");
	            return duplicateFiles;
	        }

	        traverseDirectory(root, fileHashes);

	        for (List<String> fileList : fileHashes.values()) {
	            if (fileList.size() > 1) {
	                duplicateFiles.add(fileList);
	            }
	        }

	        return duplicateFiles;
	    }

	    private static void traverseDirectory(File directory, Map<String, List<String>> fileHashes) {
	        File[] files = directory.listFiles();

	        if (files != null) {
	            for (File file : files) {
	                if (file.isDirectory()) {
	                    traverseDirectory(file, fileHashes);
	                } else {
	                    String fileHash = calculateFileHash(file);

	                    if (fileHash != null) {
	                        List<String> fileList = fileHashes.getOrDefault(fileHash, new ArrayList<>());
	                        fileList.add(file.getAbsolutePath());
	                        fileHashes.put(fileHash, fileList);
	                    }
	                }
	            }
	        }
	    }

	    private static String calculateFileHash(File file) {
	        try {
	            MessageDigest md = MessageDigest.getInstance("MD5");
	            FileInputStream fis = new FileInputStream(file);
	            byte[] dataBytes = new byte[1024];

	            int bytesRead;
	            while ((bytesRead = fis.read(dataBytes)) != -1) {
	                md.update(dataBytes, 0, bytesRead);
	            }

	            byte[] digestBytes = md.digest();
	            StringBuilder sb = new StringBuilder();

	            for (byte digestByte : digestBytes) {
	                sb.append(Integer.toString((digestByte & 0xff) + 0x100, 16).substring(1));
	            }

	            fis.close();
	            return sb.toString();
	        } catch (NoSuchAlgorithmException | IOException e) {
	            e.printStackTrace();
	            return null;
	        }
	    }
	}
