package com.reviewManager;

import java.util.*;

public class Main {

	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
		ReviewAnalyzer ra= new ReviewAnalyzer();
		int input=0;
		do {
			System.out.println("1. Add Review \n2. Format Message \n3. Show Top Reviewers \n4. Exit");
			input = sc.nextInt();
			
			switch(input) {
			
			case(1):{
				System.out.println("Enter userName : ");
				String name = sc.next();
				sc.nextLine();
				System.out.println("Enter message : ");
				String message=sc.nextLine();
				
				Review r= new Review(name, message);
				
				ra.addReview(r);
				break;
			}
			case (2):{
				System.out.println("Input Message ");
				sc.nextLine();
				String message= sc.nextLine();
				
				String transformed=ra.formatMessage(message);
				System.out.println(transformed);
				break;
			}
			case(3):{
				System.out.println("Enter limit");
				int limit = sc.nextInt();
				
				List<String >top=ra.getTopReviewers(limit);
				if(top.isEmpty()) {
					System.out.println("No reviewers found");
				}
				else {
				System.out.println(top);
				}
				break;
			}
			case(4):{
				System.out.println("Thank you for using ReviewHub!");
				break;
			}
			}
			
		}while(input!=4);
		
		sc.close();
		
		
	}
}
