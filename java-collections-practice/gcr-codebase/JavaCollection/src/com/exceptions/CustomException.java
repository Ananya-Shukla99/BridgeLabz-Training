package com.exceptions;

public class CustomException {

	public static void validateAge(int age)throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("Age must be above 18");
		}
	}
	public static void main(String[]args) {
		try {
			validateAge(18);
			System.out.println("Access granted!");
		}catch(InvalidAgeException e){
			System.err.println(e.getMessage());
		}
		
	}
}
