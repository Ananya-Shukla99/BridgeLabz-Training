package com.techNova;

import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Registration {

	public static boolean checkCode(String code) {

		String regex = "^TN-[A-Z]{2}[0-9]{4}-[A-Z]{3}[0-9]{2}-(VIP|REG)-[0-9]{4}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(code);

		if (m.matches()) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Code : ");
		String code = sc.nextLine();

		if (checkCode(code)) {
			String[] arr = code.split("-");
			String participantID = arr[1];
			String eventCode = arr[2];
			String type = arr[3];
			double amount = Double.parseDouble(arr[4]);

			System.out.println(
					"Participant ID : " + participantID + "\nEvent Code : " + eventCode + "\nTicket Type : " + type);
			System.out.println("Amount : " + amount);

			boolean service = false;
			boolean dis = false;
			double serviceCharge = 0.0;
			double discount = 0.0 ;
			if (type.equals("VIP")) {
				service = true;
				serviceCharge = (amount * 0.15);

			}
			if (eventCode.matches(".*(\\d)\\1.*")) {
				dis = true;
				discount = (amount * 0.05);
			}

			String value = (service) ? "Yes" : "No";
			System.out.println("Serice Charge Applied :" + value);

			String value2 = (dis) ? "Yes" : "No";

			System.out.println("Discount Applied : " + value2);

			
			double finalAmount = (amount + serviceCharge) - discount;

			System.out.println("Final Payable Amount :" + finalAmount);
			
		} else {
			System.out.println("Invalid Registration Code");
		}

		sc.close();
	}
}
