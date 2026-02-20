package com.smartLog;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		LogAnalyzer la= new LogAnalyzer();
		int input = 0;
		do {
			System.out.println(
					"MENU\r\n" + "1. Add Log\r\n" + "2. Transform Activity\r\n" + "3. Show Top Users\r\n" + "4. Exit");
			
		    input =sc.nextInt();
		    
		    switch(input) {
		    
		    case(1):{
		    	System.out.println("Enter user id");
		        String user = sc.nextLine();
		        
		        System.out.println("Enter user name ");
		        String name= sc.next();
		        sc.nextLine();
		        System.out.println("Enter activity : ");
		        String activity=  sc.nextLine();
		       // sc.nextLine();
		        UserLog u = new UserLog(user, name, activity); 
		        try {
		        	la.addLog(u);
			        System.out.println("Log added successfully");
		        }
		        catch( InvalidLogException e) 
		        {System.out.println(e.getMessage());}
		        
		        break;
		    }
		    case(2):{
		    	System.out.println("Enter activity");
		    	sc.nextLine();
		    	String act= sc.nextLine();
		    	String tran=la.transformActivity(act);
		    	System.out.println(tran);
		    	break;
		    }
		    case(3):{
		    	System.out.println("Enter limit ");
		    	int limit = sc.nextInt();
		    	
		    	System.out.println(la.getTopActivityUser(limit));
		    	break;
		    }
		    
		    
		    case(4):{
		    	System.out.println("Exit the system");
		    	break;
		    }
		    }
		} while (input != 4);

		sc.close();
	}
}
