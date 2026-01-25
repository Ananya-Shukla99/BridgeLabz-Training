package com.javastreams;

import java.io.*;

public class FilterStreams {

	public static void main(String[]args) {
		String inputFile="input.txt";
		String outputFile="output.txt";
		
		try(BufferedReader reader = new BufferedReader(new FileReader(inputFile));
				BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))){
			
			String line;
            while ((line = reader.readLine()) != null) {
                
                writer.write(line.toLowerCase());
                writer.newLine(); 
            }

            System.out.println("Conversion complete! All uppercase letters have been converted to lowercase.");
		}
		catch (IOException e) {
            System.err.println("IOException occurred: " + e.getMessage());
            e.printStackTrace();
        }
	}
}
