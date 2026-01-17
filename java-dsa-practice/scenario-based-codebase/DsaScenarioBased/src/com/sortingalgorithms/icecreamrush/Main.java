package com.sortingalgorithms.icecreamrush;

public class Main {

	public static void main(String[]args) {
		
		IceCream ice[]= {new IceCream("Choclate", 89), new IceCream("Strawberry", 56), new IceCream("Cookies & Cream", 77),
		new IceCream("Mint Chocolate Chip", 45), new IceCream("Butter Pecan", 23)};
		
		System.out.println("Shop last week report ");

		System.out.println("Before sorting");
		
		for(IceCream i: ice) {
			System.out.println(i);
		}
		
		System.out.println();
		
		Shop.bubbleSort(ice, ice.length-1);
		
        System.out.println("After sorting");
		
		for(IceCream i: ice) {
			System.out.println(i);
		}
		
	}
}
