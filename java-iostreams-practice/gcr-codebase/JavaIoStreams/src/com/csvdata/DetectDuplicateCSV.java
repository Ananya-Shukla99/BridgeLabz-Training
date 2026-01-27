package com.csvdata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class DetectDuplicateCSV {

    public static void main(String[] args) {

        String csvFile = "src/com/csvdata/employees.csv";
        Set<String> seenIds = new HashSet<>();
        boolean duplicatesFound = false;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            String line;

            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String id = data[0];

                if (!seenIds.add(id)) {
                    System.out.println("Duplicate record found:");
                    System.out.println(line);
                    System.out.println();
                    duplicatesFound = true;
                }
            }

            if (!duplicatesFound) {
                System.out.println("No duplicate records found.");
            }

        } catch (IOException e) {
            System.out.println("Error reading the CSV file.");
            e.printStackTrace();
        }
    }
}
