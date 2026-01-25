package com.javastreams;

import java.io.*;

public class StudentDataStreams {

	public static void main(String[] args) {

		String fileName = "students.data";

		// Sample student data
		int[] rollNumbers = { 101, 102, 103 };
		String[] names = { "Aman", "Bhavna", "Raghu" };
		double[] gpa = { 8.5, 9.1, 7.8 };

		// Write student data to binary file
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
			for (int i = 0; i < rollNumbers.length; i++) {
				
				dos.writeInt(rollNumbers[i]);
				dos.writeUTF(names[i]);
				dos.writeDouble(gpa[i]);
			}
			System.out.println("Student data written to " + fileName);
		} 
		catch (IOException e) {
			System.err.println("Error writing data: " + e.getMessage());
			e.printStackTrace();
		}

		// Read student data from binary file
		try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
			System.out.println("Retrieved Student Data:");
			while (true) {
				try {
					int roll = dis.readInt();
					String name = dis.readUTF();
					double gpas = dis.readDouble();
					System.out.printf("Roll No: %d, Name: %s, GPA: %.2f%n", roll, name, gpas);
				} 
				catch (EOFException eof) {
					break;
				}
			}
		}
		catch (IOException e) {
			System.err.println("Error reading data: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
