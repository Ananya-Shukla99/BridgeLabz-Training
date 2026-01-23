package com.sortingalgorithms.foodfest;

import java.util.*;

public class FoodFestMergeSort {

	// Stable merge of two sorted lists
	public static List<Stall> merge(List<Stall> left, List<Stall> right) {
		List<Stall> result = new ArrayList<>();
		int i = 0, j = 0;

		while (i < left.size() && j < right.size()) {
			if (left.get(i).footfall <= right.get(j).footfall) {
				result.add(left.get(i));
				i++;
			} else {
				result.add(right.get(j));
				j++;
			}
		}

		while (i < left.size()) {
			result.add(left.get(i++));
		}

		while (j < right.size()) {
			result.add(right.get(j++));
		}

		return result;
	}

	// Merge Sort
	public static List<Stall> mergeSort(List<Stall> stalls) {
		if (stalls.size() <= 1) {
			return stalls;
		}

		int mid = stalls.size() / 2;
		List<Stall> left = mergeSort(new ArrayList<>(stalls.subList(0, mid)));
		List<Stall> right = mergeSort(new ArrayList<>(stalls.subList(mid, stalls.size())));

		return merge(left, right);
	}
}
