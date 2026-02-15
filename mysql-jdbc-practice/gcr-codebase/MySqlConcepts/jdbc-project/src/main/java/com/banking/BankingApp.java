package com.banking;

import java.sql.*;
import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/bankingsystem_db";
		String user = "root";
		String password = "root123";

		try {
			// Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Connect
			Connection con = DriverManager.getConnection(url, user, password);

			Scanner sc = new Scanner(System.in);

			while (true) {

				System.out.println("\n===== BANK MENU =====");
				System.out.println("1. Check Balance");
				System.out.println("2. Transfer Money");
				System.out.println("3. Transaction History");
				System.out.println("4. Exit");
				System.out.print("Enter choice: ");

				int choice = sc.nextInt();

				switch (choice) {

				// Check Balance
				case 1:
					System.out.print("Enter Account ID: ");
					int id = sc.nextInt();

					CallableStatement cs1 = con.prepareCall("{CALL check_balance(?)}");

					cs1.setInt(1, id);

					ResultSet rs1 = cs1.executeQuery();

					if (rs1.next()) {
						System.out.println("ID: " + rs1.getInt(1));
						System.out.println("Name: " + rs1.getString(2));
						System.out.println("Balance: " + rs1.getDouble(3));
					} else {
						System.out.println("Account Not Found!");
					}

					break;

				// Transfer Money
				case 2:
					System.out.print("Sender ID: ");
					int sender = sc.nextInt();

					System.out.print("Receiver ID: ");
					int receiver = sc.nextInt();

					System.out.print("Amount: ");
					double amount = sc.nextDouble();

					CallableStatement cs2 = con.prepareCall("{CALL transfer_money(?,?,?)}");

					cs2.setInt(1, sender);
					cs2.setInt(2, receiver);
					cs2.setDouble(3, amount);

					ResultSet rs2 = cs2.executeQuery();

					if (rs2.next()) {
						System.out.println(rs2.getString("Message"));
					}

					break;

				// Transaction History
				case 3:
					System.out.print("Enter Account ID: ");
					int acc = sc.nextInt();

					CallableStatement cs3 = con.prepareCall("{CALL transaction_history(?)}");

					cs3.setInt(1, acc);

					ResultSet rs3 = cs3.executeQuery();

					System.out.println("\n--- Transaction History ---");

					boolean found = false;

					while (rs3.next()) {
						found = true;

						System.out.println("ID: " + rs3.getInt(1));
						System.out.println("Sender: " + rs3.getString(2));
						System.out.println("Receiver: " + rs3.getString(3));
						System.out.println("Amount: " + rs3.getDouble(4));
						System.out.println("Date: " + rs3.getTimestamp(5));
						System.out.println("--------------------");
					}

					if (!found) {
						System.out.println("No Transactions Found!");
					}

					break;

				// Exit
				case 4:
					System.out.println("Thank You!");
					con.close();
					sc.close();
					return;

				default:
					System.out.println("Invalid Choice!");
				}

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		
	}
}
