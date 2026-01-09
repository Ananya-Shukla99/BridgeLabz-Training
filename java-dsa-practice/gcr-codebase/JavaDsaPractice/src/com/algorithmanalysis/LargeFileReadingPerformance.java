package com.algorithmanalysis;

import java.io.*;

class LargeFileReadPerformance {

    private static final String FILE_NAME = "large_test_file.txt";
    private static final int BUFFER_SIZE = 8192;

    //create Large File
    public static void createLargeFile(long sizeInMB) throws IOException {
        System.out.println("Creating file of size " + sizeInMB + " MB...");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            long totalChars = sizeInMB * 1024 * 1024;
            for (long i = 0; i < totalChars; i++) {
                writer.write('A');
            }
        }
        System.out.println("File created successfully.\n");
    }

    //read using FileReader
    public static void readUsingFileReader() throws IOException {
        try (FileReader reader = new FileReader(FILE_NAME)) {
            char[] buffer = new char[BUFFER_SIZE];
            while (reader.read(buffer) != -1) {
               
            }
        }
    }

    //read using InputStreamReader 
    public static void readUsingInputStreamReader() throws IOException {
        try (InputStreamReader reader =
                     new InputStreamReader(new FileInputStream(FILE_NAME))) {
            char[] buffer = new char[BUFFER_SIZE];
            while (reader.read(buffer) != -1) {
                
            }
        }
    }

    // main Method 
    public static void main(String[] args) {
        try {
            
            long fileSizeMB = 100;

            createLargeFile(fileSizeMB);

            //fileReader Timing
            long start = System.nanoTime();
            readUsingFileReader();
            long end = System.nanoTime();
            System.out.println("FileReader Time: " +(end - start) / 1_000_000.0 + " ms");

            //inputStreamReader Timing
            start = System.nanoTime();
            readUsingInputStreamReader();
            end = System.nanoTime();
            System.out.println("InputStreamReader Time: " +(end - start) / 1_000_000.0 + " ms");

        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
