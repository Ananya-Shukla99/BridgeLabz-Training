package com.smartcheckout;

import java.util.*;

public class SmartCheckout {

	// Customer Queue
	Queue<Customer> customerQueue=new LinkedList<>();

	// List of item with price
	HashMap<String , Double> priceMap=new HashMap<>();
	
	//List of stock
	HashMap<String ,Integer> stockMap=new HashMap<>();
	
	
	//adding customer
	public void addCustomer(Customer c) {
		customerQueue.offer(c);
		System.out.println(c.name +" Added to the queue ");
	}
	
	//removing /billing 
	public void processCustomer() {
		if(customerQueue.isEmpty()) {
			System.out.println("No customer in queue");
			return ;
		}
		
		Customer c= customerQueue.poll();
		double total=0;
		
		System.out.println("\n Billing");
		
	    for(String item : c.items) {
			if(stockMap.get(item)>0) {
				double price =priceMap.get(item);
				total +=price;
				stockMap.put(item, stockMap.get(item)-1);
				System.out.println(item + " : " + price);				
			}
			else {
				System.out.println(item + " is out of stock ");
			}
		}
	    
	    System.out.println("Total bill = "+total);
	}
	
	// Display stock
    public void showStock() {
        System.out.println("\nCurrent Stock:");
        for (String item : stockMap.keySet()) {
            System.out.println(item + " : " + stockMap.get(item));
        }
    }
}
