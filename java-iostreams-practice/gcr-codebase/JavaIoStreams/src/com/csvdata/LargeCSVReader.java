package com.csvdata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LargeCSVReader {

    private static final int CHUNK_SIZE = 100;

    public static void main(String[] args) {

        String csvFile = "src/com/csvdata/employees.csv";
        int totalRecords = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            String line;
            List<String> chunk = new ArrayList<>(CHUNK_SIZE);


            br.readLine();

            while ((line = br.readLine()) != null) {
                chunk.add(line);

                if (chunk.size() == CHUNK_SIZE) {
                    processChunk(chunk);
                    totalRecords += chunk.size();
                    chunk.clear();

                    System.out.println("Records processed so far: " + totalRecords);
                }
            }

            if (!chunk.isEmpty()) {
                processChunk(chunk);
                totalRecords += chunk.size();
            }

            System.out.println("Total records processed: " + totalRecords);

        } catch (IOException e) {
            System.out.println("Error reading large CSV file.");
            e.printStackTrace();
        }
    }

   
	private static void processChunk(List<String> records) {

        for (String record : records) {
            System.out.println(record);
        }
    }
}
