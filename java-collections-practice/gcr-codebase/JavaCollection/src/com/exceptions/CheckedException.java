package com.exceptions;

import java.io.*;

public class CheckedException {

	public static void main(String[]args) {
		
		try {
			FileReader fr= new FileReader("example.txt");
			 BufferedReader br = new BufferedReader(fr);
			String line;
			
			while((line = br.readLine())!= null) {
				System.out.println(line);
			}
			fr.close();
		}catch(IOException e){
			System.out.println(" An IOException occurred : "+ e.getMessage());
		}
	}
}
