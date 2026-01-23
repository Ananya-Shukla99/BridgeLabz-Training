package com.sortingalgorithms.gamerzone;

import java.util.*;

public class ScoreRanking {

	// attribute
	public String name;
	protected List<Player> list;

	// constructor
	public ScoreRanking(String name, List<Player> list) {
		this.name = name;
		this.list = list;
	}

	public static int partition(Player[] brr, int low, int high) {

		Player p = brr[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) {

			if (brr[j].getMarks() > p.getMarks()) {

				i++;
				Player temp = brr[i];
				brr[i] = brr[j];
				brr[j] = temp;

			}
		}

		Player temp = brr[i + 1];
		brr[i + 1] = brr[high];
		brr[high] = temp;

		return i + 1;

	}

	public static void quickSort(Player[] brr, int i, int j) {

		if (i < j) {
			int pi = partition(brr, i, j);

			quickSort(brr, i, pi - 1);
			quickSort(brr, pi + 1, j);

		}
	}
}
