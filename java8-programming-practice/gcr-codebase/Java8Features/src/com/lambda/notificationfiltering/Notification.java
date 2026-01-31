package com.lambda.notificationfiltering;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class Notification {

	public static void main(String[]args) {
		
		//Creating Alert
		Alert one= new Alert("Morning medicine", true);
		Alert two= new Alert("After breakFast medicine", false);
		Alert three= new Alert("Lunch medicine", true);
		Alert four= new Alert("Before dinnermedicine", false);
		Alert five= new Alert("Bed time medicine", true);

		//List to store Alert
		List<Alert>list =new ArrayList<>();
	    list.add(one);
	    list.add(two);
	    list.add(three);
	    list.add(four);
	    list.add(five);
	    System.out.println("List of Alerts ");
	    for(Alert a:list) {
	    	System.out.println(a);
	    }
	    
	    System.out.println("------------------------------------");
	    //Predicate to test , weather to show or not
		Predicate <Alert> p= (a)-> a.show;
		Consumer <Alert> c= (a)-> System.out.println(a);
		
		System.out.println("Nofication of only");
		for(Alert a:list) {
			if(p.test(a)) {
				c.accept(a);
			}
		}
		
	}
}
