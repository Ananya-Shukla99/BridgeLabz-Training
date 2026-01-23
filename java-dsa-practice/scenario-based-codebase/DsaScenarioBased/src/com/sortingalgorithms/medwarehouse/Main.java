package com.sortingalgorithms.medwarehouse;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		// Creating shop objects
		Shop shop1 = new Shop("City Pharmacy", Arrays.asList(new Medicine("Insulin", 10, "City Pharmacy"),
				new Medicine("Paracetamol", 40, "City Pharmacy")));

		Shop shop2 = new Shop("Health Plus", Arrays.asList(new Medicine("Vitamin C", 20, "Health Plus"),
				new Medicine("Antibiotic", 60, "Health Plus")));

		Shop shop3 = new Shop("WellCare",
				Arrays.asList(new Medicine("Cough Syrup", 15, "WellCare"), new Medicine("Painkiller", 30, "WellCare")));

		// Combine medicines from all shops
		List<Medicine> allMedicines = new ArrayList<>();
		allMedicines.addAll(Arrays.asList(shop1.getMedicineArray()));
		allMedicines.addAll(Arrays.asList(shop2.getMedicineArray()));
		allMedicines.addAll(Arrays.asList(shop3.getMedicineArray()));

		// Convert list to array
		Medicine[] medicineArray = allMedicines.toArray(new Medicine[0]);

		// merge Sort
		MergeSort.mergeSort(medicineArray, 0, medicineArray.length - 1);

		// Display sorted medicines
		System.out.println("Medicines sorted by expiry date:");

		for (Medicine m : medicineArray) {
			System.out.println(m.name + " - " + m.getExpiryDays() + " days " + " form shop: " + m.shopName);
		}
	}
}
