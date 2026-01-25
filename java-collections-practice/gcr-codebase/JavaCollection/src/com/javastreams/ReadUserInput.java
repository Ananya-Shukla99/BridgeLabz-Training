package com.javastreams;

import java.io.*;

public class ReadUserInput {

	public static void main(String []args) {
		
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		
		try {
			//taking input
			System.out.println("Enter your name : ");
			String name = reader.readLine();
			
			System.out.println("Enter your age : ");
			String age= reader.readLine();
			
			System.out.println("Enter your favorite programming language : ");
			String language =reader.readLine();
			
			//write input to file
			
			FileWriter writer =new FileWriter ("Details.txt");
			writer.write("Name : "+name +"\n");
			writer.write("Age "+age +"\n");
			writer.write("Favourite programming language : "+ language +"\n");
			
			writer.close();
			
			System.out.println("User details saved successfully to file ");
					
		}catch(IOException e){
			System.out.println("Error while reading input or writing to file ");
		}
	}
}
