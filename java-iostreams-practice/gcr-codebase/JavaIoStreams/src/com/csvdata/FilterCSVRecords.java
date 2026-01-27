package com.csvdata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilterCSVRecords {
    public static void main(String[] args) {

        String csvFile = "src/com/csvdata/students.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            String line;

            br.readLine();

            System.out.println("Students scoring more than 80 marks:");
            System.out.println("");

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                int marks = Integer.parseInt(data[3]);

                if (marks > 80) {
                    System.out.println("ID    : " + data[0]);
                    System.out.println("Name  : " + data[1]);
                    System.out.println("Age   : " + data[2]);
                    System.out.println("Marks : " + marks);
                    System.out.println("");
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading the CSV file.");
            e.printStackTrace();
        }
    }
}
