package com.library;

import java.sql.*;
import java.util.Scanner;

public class LibraryApp {

	static final String URL = "jdbc:mysql://localhost:3306/library_db";
	static final String USER = "root";
	static final String PASS = "root123";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {

			 Class.forName("com.mysql.cj.jdbc.Driver");
 
			Connection con = DriverManager.getConnection(URL, USER, PASS);

			System.out.println("Connected to Library Database!");

			while (true) {

				System.out.println("\n--- LIBRARY MENU ---");
				System.out.println("1. Show All Books");
				System.out.println("2. Borrow Report");
				System.out.println("3. Fine Calculation");
				System.out.println("4. Search By Title");
				System.out.println("5. Search By Category");
				System.out.println("6. Search Multiple Filters");
				System.out.println("7. Not Returned Books");
				System.out.println("8. Exit");

				System.out.print("Enter choice: ");
				int ch = sc.nextInt();
				sc.nextLine();

				switch (ch) {

				// SHOW BOOKS
				case 1:

					Statement st1 = con.createStatement();

					ResultSet rs1 = st1.executeQuery("SELECT * FROM book");

					while (rs1.next()) {

						System.out.println(rs1.getInt(1) + " | " + rs1.getString(2) + " | " + rs1.getString(3) + " | "
								+ rs1.getString(4) + " | " + rs1.getInt(5) + " | " + rs1.getInt(6));
					}

					break;

				// BORROW REPORT
				case 2:

					String joinQuery =

							"SELECT s.name, b.title, br.issue_date, br.due_date, br.return_date " + "FROM students s "
									+ "JOIN borrow_records br ON s.student_id = br.student_id "
									+ "JOIN book b ON br.book_id = b.book_id";

					Statement st2 = con.createStatement();

					ResultSet rs2 = st2.executeQuery(joinQuery);

					while (rs2.next()) {

						System.out.println(rs2.getString(1) + " | " + rs2.getString(2) + " | " + rs2.getDate(3) + " | "
								+ rs2.getDate(4) + " | " + rs2.getDate(5));
					}

					break;

				// FINE
				case 3:

					String fineQuery =

							"SELECT record_id, " + "CASE WHEN return_date > due_date "
									+ "THEN DATEDIFF(return_date, due_date)*5 " + "ELSE 0 END AS fine "
									+ "FROM borrow_records";

					Statement st3 = con.createStatement();

					ResultSet rs3 = st3.executeQuery(fineQuery);

					while (rs3.next()) {

						System.out.println("Record: " + rs3.getInt(1) + " Fine: " + rs3.getInt(2));
					}

					break;

				// SEARCH TITLE
				case 4:

					System.out.print("Enter title keyword: ");
					String title = sc.nextLine();

					String tQuery = "SELECT * FROM book WHERE title LIKE ?";

					PreparedStatement ps1 = con.prepareStatement(tQuery);

					ps1.setString(1, "%" + title + "%");

					ResultSet rs4 = ps1.executeQuery();

					while (rs4.next()) {

						System.out.println(rs4.getInt(1) + " | " + rs4.getString(2));
					}

					break;

				// SEARCH CATEGORY
				case 5:

					System.out.print("Enter category: ");
					String cat = sc.nextLine();

					String cQuery = "SELECT * FROM book WHERE category=?";

					PreparedStatement ps2 = con.prepareStatement(cQuery);

					ps2.setString(1, cat);

					ResultSet rs5 = ps2.executeQuery();

					while (rs5.next()) {

						System.out.println(rs5.getInt(1) + " | " + rs5.getString(2));
					}

					break;

				// MULTIPLE FILTER
				case 6:

					System.out.print("Author keyword: ");
					String auth = sc.nextLine();

					System.out.print("Category: ");
					String cat2 = sc.nextLine();

					String mQuery =

							"SELECT * FROM book " + "WHERE author LIKE ? AND category=?";

					PreparedStatement ps3 = con.prepareStatement(mQuery);

					ps3.setString(1, "%" + auth + "%");
					ps3.setString(2, cat2);

					ResultSet rs6 = ps3.executeQuery();

					while (rs6.next()) {

						System.out.println(rs6.getInt(1) + " | " + rs6.getString(2));
					}

					break;

				// NOT RETURNED
				case 7:

					String nrQuery =

							"SELECT s.name, b.title, br.issue_date, br.due_date " + "FROM borrow_records br "
									+ "JOIN students s ON br.student_id=s.student_id "
									+ "JOIN book b ON br.book_id=b.book_id " + "WHERE br.return_date IS NULL";

					Statement st4 = con.createStatement();

					ResultSet rs7 = st4.executeQuery(nrQuery);

					while (rs7.next()) {

						System.out.println(rs7.getString(1) + " | " + rs7.getString(2) + " | " + rs7.getDate(3) + " | "
								+ rs7.getDate(4));
					}

					break;

				// EXIT
				case 8:

					con.close();
					sc.close();

					System.out.println("Library Closed");
					return;

				default:
					System.out.println("Invalid Choice");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
