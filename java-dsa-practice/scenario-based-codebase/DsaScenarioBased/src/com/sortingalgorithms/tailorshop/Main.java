package com.sortingalgorithms.tailorshop;

public class Main {

	public static void main(String[] args) {

		// Creating order object
		Order o1 = new Order(101, 8);
		Order o2 = new Order(102, 6);
		Order o3 = new Order(103, 1);
		Order o4 = new Order(104, 2);
		Order o5 = new Order(105, 7);
		Order o6 = new Order(106, 3);

		// storing the order
		Order[] list = { o1, o2, o3, o4, o5, o6 };

		// Printing the list
		System.out.println("Orders before sorting deadline");
		for (Order o : list) {
			System.out.println(o.orderID + " : " + o.deadline +" days before deadline");
		}

		System.out.println("----------------------------------");
		// applying insertion sort
		TailorShop.instertionSort(list, o1);
		TailorShop.instertionSort(list, o2);
		TailorShop.instertionSort(list, o3);
		TailorShop.instertionSort(list, o4);
		TailorShop.instertionSort(list, o5);
		TailorShop.instertionSort(list, o6);

		// Printing the list
		System.out.println("Orders after sorting deadline");
		for (Order o : list) {
			System.out.println(o.orderID + " : " + o.deadline  +" days before deadline");
		}
	}
}
