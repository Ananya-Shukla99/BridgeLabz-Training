package com.sortingalgorithms.robowarehouse;

public class Main {

	public static void main(String[]args) {
		
		Package [] robo =new Package[10];
		
		int count=0;
		
		robo[count++]=new Package("Gift", 6);
		RoboWarehouse.insertionSort(robo, count);
		
		robo[count++]=new Package("box", 3);
		RoboWarehouse.insertionSort(robo, count);
		
		robo[count++]=new Package("Chothes", 7);
		RoboWarehouse.insertionSort(robo, count);
		
		robo[count++]=new Package("Choclate", 9);
		RoboWarehouse.insertionSort(robo, count);
		
		robo[count++]= new Package("Candy", 19);
		RoboWarehouse.insertionSort(robo, count);
		
		robo[count++]=new Package("Chips", 2);
		RoboWarehouse.insertionSort(robo, count);
		
		robo[count++]=new Package("Snacks", 4);
		RoboWarehouse.insertionSort(robo, count);
		
		System.out.println("Sorted package");
		
		for(int i=0;i<count; i++) {
			System.out.print(robo[i] + "  ");
		}
		
	}
}
