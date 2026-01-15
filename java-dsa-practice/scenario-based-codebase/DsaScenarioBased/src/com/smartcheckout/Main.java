package com.smartcheckout;

import java.util.*;

public class Main {
	
    public static void main(String[] args) {

        SmartCheckout shop = new SmartCheckout();

        // Add items to store
        shop.priceMap.put("Milk", 40.0);
        shop.priceMap.put("Bread", 30.0);
        shop.priceMap.put("Eggs", 10.0);

        shop.stockMap.put("Milk", 5);
        shop.stockMap.put("Bread", 3);
        shop.stockMap.put("Eggs", 10);

        // Customers 
        Customer c1 = new Customer("Alice", Arrays.asList("Milk", "Eggs"));
        Customer c2 = new Customer("Bob", Arrays.asList("Bread", "Milk", "Eggs"));

        shop.addCustomer(c1);
        shop.addCustomer(c2);

        shop.processCustomer();
        shop.processCustomer();

        shop.showStock();
    }
}
