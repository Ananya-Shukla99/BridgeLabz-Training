package com.staticmethod.dateformat;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		LocalDate input = LocalDate.now();

		String f1 = DateUtils.formatDate(input, "yyyy-MM-dd");
		String f2 = DateUtils.formatDate(input, "dd-MM-yyyy");

		System.out.println("Date in format1 :" + f1);
		System.out.println("Date in format2 :" + f2);
	}
}
