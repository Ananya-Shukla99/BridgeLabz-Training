package com.lambda.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class ECommerce {

	public static void main(String []args) {
		
		// Creating products
		Product p1= new Product("Bag", 500, 3.4 , 50);
		Product p2= new Product("Bottel", 340, 2.4 , 30);
		Product p3= new Product("Pencile Box", 250, 3 , 10);
		Product p4= new Product("Toy", 400, 4.4 , 20);
		Product p5= new Product("Dog", 300, 5 , 60);
		Product p6= new Product("Cat", 700, 2 , 40);
		
		// Adding in list
		List<Product> list= new ArrayList<>();
		list.add(p6);
		list.add(p5);
		list.add(p4);
		list.add(p3);
		list.add(p2);
		list.add(p1);
		
		System.out.println("Original list of products");
		for(Product p:list) {
			System.out.println(p);
		}
		System.out.println("---------------------------------------");
		//Sorting by price
		list.sort((a,b)-> Double.compare(a.price,b.price));
		System.out.println("Sorted by price");
		for(Product p:list) {
			System.out.println(p);
		}
		System.out.println("---------------------------------------");
		//Sorting by rating
		list.sort((a,b)-> Double.compare(a.rating,b.rating));
		System.out.println("Sorted by rating");
		for(Product p:list) {
			System.out.println(p);
		}
		System.out.println("---------------------------------------");
		//Sorting by discount
		list.sort((a,b)-> Double.compare(a.discount,b.discount));
		System.out.println("Sorted by discount");
		for(Product p:list) {
			System.out.println(p);
		}
	}
}
