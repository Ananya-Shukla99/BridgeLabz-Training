package com.designprinciples.levelone;

public class CustomerOrder {

	private String name;

    public CustomerOrder(String name) {
        this.name = name;
    }


    public void placeOrder(Order order) {
        System.out.println("\nCustomer " + name + " placed Order " + order);
    }

    public String getName() {
        return name;
    }
}
