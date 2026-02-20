package com.smartTracker;

import java.util.*;

public class Main {

	public static void activity1(int[] temp) {
		double avg = 0;
		for (int i = 0; i < 7; i++) {
			avg += temp[i];
		}
		
		System.out.println("Total :"+(avg/7));
	}

	public static void activity2(int[] temp) {

		int max = Integer.MIN_VALUE;
		int mini = Integer.MAX_VALUE;

		for (int i = 0; i < 7; i++) {
			if (temp[i] > max) {
				max = temp[i];
			}
			if (temp[i] < mini) {
				mini = temp[i];
			}
		}
		System.out.println("Highest Temperature:" + max + "°C");
		System.out.println("Coldest Temperature:" + mini + "°C");
	}

	public static void activity3(int[] temp) {
		int count = 0;
		for (int i = 0; i < 7; i++) {
			if (temp[i] > 30) {
				count++;
			}
		}

		System.out.println("Number of hot days (>30 °C)" + count);
	}

	public static void activity6(int[] sales) {

		int count = 0;
		for (int i = 0; i < 7; i++) {
			if (sales[i] > 100) {
				count++;
			}
		}
		System.out.println("Number of high sales day (>100) : " + count);
	}

	public static void activity4(int[] sales) {

		double total = 0;

		for (int i = 0; i < 7; i++) {

			total += sales[i];
		}
		System.out.println("Total sales " + total);
		System.out.println("Average sales " + total / 7);
	}

	public static void activity7(int [] sales, int target) {
		
		int index=0;
		for(int i=0;i<7;i++) {
			if(sales[i]==target) {
				index=i;
			}
		}
		System.out.println("Sale "+target +" found on Day "+  index+1);
	}
	public static void activity5(int[] sales) {

		int high = Integer.MIN_VALUE;
		int low = Integer.MAX_VALUE;
		int maxIndex = 0;
		int minIndex = 0;
		for (int i = 0; i < 7; i++) {

			if (sales[i] > high) {
				high = sales[i];
				maxIndex = i;
			}
			if (sales[i] < low) {
				low = sales[i];
				minIndex = i;
			}

		}

		System.out.println(high + " on Day " + (maxIndex+1));
		System.out.println(low + " on Day " + (minIndex+1));

	}

	public static void main(String[] args) {

		System.out.println("Enter the sales");
		Scanner sc = new Scanner(System.in);

		int[] sales = new int[7];

		for (int i = 0; i < 7; i++) {

			sales[i] = sc.nextInt();

		}

		System.out.println("Enter the temp :");
		int[] temp = new int[7];

		for (int i = 0; i < 7; i++) {

			temp[i] = sc.nextInt();

		}
		sc.close();
		activity1(temp);
		activity2(temp);
		activity3(temp);
		activity4(sales);
		activity5(sales);
		activity6(sales);
		activity7(sales, 150);
		
		//update sales
		sales[1]=95;;
		for(int i=0;i<7;i++) {
			System.out.println("Sales on day "+i+1 +" :"+ sales[i]);
		}

	}
}
