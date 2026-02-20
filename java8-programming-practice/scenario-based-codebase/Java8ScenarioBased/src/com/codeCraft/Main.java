package com.codeCraft;

import java.util.Scanner;

public class Main {

	public static boolean validateSubmission(String code) {

		String regex = "^CC-[A-Z]{3}[0-9]{2}[A-Z]-[A-Z]{5}[0-9]{2}-[0-9]{1,3}(M|H)-[0-9]{4}$";

		return code.matches(regex);
	}
	
	public static String getPerformance(int score) {
		
		String performance = null;
		
		if(score>=900 && score<=1000 ) {
	    	performance="Elite";
	    }
	    else  if(score>=750 && score<=899) {
	    	performance="Pro";
	    } else if(score>=500 && score<=749) {
	    	performance="Intermediate";
	    }else {
	    	performance="Beginner";
	    }
		
		return performance;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String code = sc.next();

		if (validateSubmission(code)) {

			String[] arr = code.split("-");

			String userId = arr[1];
			String projectCode = arr[2];
			String duration = arr[3];
		    int score = Integer.parseInt(arr[4]);
		    
		    int value= Integer.parseInt(duration.substring(0, duration.length()-1));
		    
		    char letter= duration.charAt(duration.length()-1);
		    
		    double time=0;
		    
		    if(letter=='H') {
		    	time=value*60;
		    }else {
		    	time=value;
		    }
		    
		    boolean bonus=false;
		    if(code.matches(".*[MNBVCXZSDFGHJKLPYTRWQ]{4,}|(\\d)\\2.*")) {
		    	bonus=true;
		    }
		    
		    if(bonus) {
		    	score+=50;
		    }
		    
		    String performance=getPerformance(score);
		    
		    double productivity= (double)score/time;
		    
		    
		    System.out.println("User ID : "+ userId);
		    
		    System.out.println("Project Code : "+ projectCode);
		    System.out.println("Duration (minutes) : "+time);
		    System.out.println("Original Score : "+score);
		    System.out.println("Bonus Applied : "+ bonus);
		    System.out.println("Final Score : "+ score+bonus);
		    System.out.println("Performance Level : "+ performance );
		    System.out.println("Productivity Index  : "+productivity);
 
		    
		} else {
			System.out.println("Invalid Submission Format");
		}
		
		sc.close();
	}
}

