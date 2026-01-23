package com.sortingalgorithms.foodfest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Stall> zone1 = Arrays.asList(new Stall("BurgerHub", 120), new Stall("PizzaPoint", 200));

		List<Stall> zone2 = Arrays.asList(new Stall("TacoTown", 150), new Stall("PastaPlace", 220));

		List<Stall> zone3 = Arrays.asList(new Stall("SweetTreats", 100), new Stall("CoffeeCorner", 180));

		// Combine zone-wise sorted data
		List<Stall> allStalls = new ArrayList<>();
		allStalls.addAll(zone1);
		allStalls.addAll(zone2);
		allStalls.addAll(zone3);

		// Apply Merge Sort
		List<Stall> sortedStalls = FoodFestMergeSort.mergeSort(allStalls);

		// Display result
		System.out.println("Master Stall Ranking by Footfall:");
		for (Stall stall : sortedStalls) {
			System.out.println(stall.name + " : " + stall.footfall);
		}
	}
}
