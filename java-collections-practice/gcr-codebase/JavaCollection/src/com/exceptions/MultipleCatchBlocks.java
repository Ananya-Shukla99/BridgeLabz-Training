package com.exceptions;

public class MultipleCatchBlocks {

	public static void main(String []args) {
		
		try {
			int []arr = {0, 9, 8};
			
			System.out.println("Printing index : "+ arr[3]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught an ArrayIndexOutOfBoundsException : "+ e.getMessage());
		}catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
	}
}
