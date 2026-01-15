package com.smartcheckout;

import java.util.*;

public class Customer {

	//attributes
	String name;
    List<String> items;

    //constructor
    Customer(String name, List<String> items) {
        this.name = name;
        this.items = items;
    }
}
