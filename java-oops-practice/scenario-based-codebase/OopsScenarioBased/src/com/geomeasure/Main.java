package com.geomeasure;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		//Creating scanner object
		Scanner sc = new Scanner(System.in);
		
		GeoMeasure geo = new GeoMeasure();

		//Taking user input 
		System.out.println("\nEnter details for Line 1 ");
		System.out.print("x1 ");
		int x1 = sc.nextInt();
		System.out.print("y1 ");
		int y1 = sc.nextInt();
		System.out.print("x2 ");
		int x2 = sc.nextInt();
		System.out.print("y2 ");
		int y2 = sc.nextInt();

		Line l1 = new Line("Line-" + 1 + " A", x1, y1, x2, y2);
		
		geo.addLine(l1);

		System.out.println("\nEnter details for Line 2 ");
		System.out.print("x1 ");
		int x3 = sc.nextInt();
		System.out.print("y1 ");
		int y3 = sc.nextInt();
		System.out.print("x2 ");
		int x4 = sc.nextInt();
		System.out.print("y2 ");
		int y4 = sc.nextInt();

		Line l2 = new Line("Line-" + 2 + " B", x3, y3, x4, y4);
		
		geo.addLine(l2);

		System.out.println("\nComparison Result:");
		geo.compareLength(l1, l2);

		sc.close();
	}
}
