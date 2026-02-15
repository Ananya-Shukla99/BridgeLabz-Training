package com.employee;

import java.sql.*;
import java.util.Scanner;

public class EmployeeApp {

	static final String URL = "jdbc:mysql://localhost:3306/employee_db";
	static final String USER = "root";
	static final String PASS = "root123";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {

			Connection con = DriverManager.getConnection(URL, USER, PASS);

			System.out.println("Connected to Database!");

			while (true) {

				System.out.println("\n--- EMPLOYEE MENU ---");
				System.out.println("1. Add Employee");
				System.out.println("2. View All Employees");
				System.out.println("3. Update Salary");
				System.out.println("4. Delete Employee");
				System.out.println("5. Search by Name");
				System.out.println("6. Exit");

				System.out.print("Enter choice: ");
				int ch = sc.nextInt();
				sc.nextLine(); // clear buffer

				switch (ch) {

				// ADD
				case 1:

					System.out.print("Name: ");
					String name = sc.nextLine();

					System.out.print("Department: ");
					String dept = sc.nextLine();

					System.out.print("Salary: ");
					double sal = sc.nextDouble();
					sc.nextLine();

					System.out.print("Email: ");
					String email = sc.nextLine();

					String insert = "INSERT INTO employees(name,department,salary,email) VALUES(?,?,?,?)";

					PreparedStatement ps1 = con.prepareStatement(insert);

					ps1.setString(1, name);
					ps1.setString(2, dept);
					ps1.setDouble(3, sal);
					ps1.setString(4, email);

					ps1.executeUpdate();

					System.out.println("Employee Added!");
					break;

				// VIEW
				case 2:

					Statement st = con.createStatement();

					ResultSet rs = st.executeQuery("SELECT * FROM employees");

					System.out.println("\nID | Name | Dept | Salary | Email");

					while (rs.next()) {

						System.out.println(
								rs.getInt("emp_id") + " | " + rs.getString("name") + " | " + rs.getString("department")
										+ " | " + rs.getDouble("salary") + " | " + rs.getString("email"));
					}

					break;

				// UPDATE
				case 3:

					System.out.print("Enter Employee ID: ");
					int id = sc.nextInt();

					System.out.print("New Salary: ");
					double newSal = sc.nextDouble();

					String update = "UPDATE employees SET salary=? WHERE emp_id=?";

					PreparedStatement ps2 = con.prepareStatement(update);

					ps2.setDouble(1, newSal);
					ps2.setInt(2, id);

					int rows = ps2.executeUpdate();

					if (rows > 0)
						System.out.println("Salary Updated!");
					else
						System.out.println("Employee Not Found");

					break;

				// DELETE
				case 4:

					System.out.print("Enter Employee ID: ");
					int did = sc.nextInt();

					String delete = "DELETE FROM employees WHERE emp_id=?";

					PreparedStatement ps3 = con.prepareStatement(delete);

					ps3.setInt(1, did);

					ps3.executeUpdate();

					System.out.println("Employee Deleted!");
					break;

				// SEARCH
				case 5:

					System.out.print("Enter Name Start: ");
					String sname = sc.nextLine();

					String search = "SELECT * FROM employees WHERE name LIKE ?";

					PreparedStatement ps4 = con.prepareStatement(search);

					ps4.setString(1, sname + "%");

					ResultSet rs2 = ps4.executeQuery();

					boolean found = false;

					while (rs2.next()) {

						found = true;

						System.out.println(rs2.getInt("emp_id") + " | " + rs2.getString("name") + " | "
								+ rs2.getString("department") + " | " + rs2.getDouble("salary") + " | "
								+ rs2.getString("email"));
					}

					if (!found)
						System.out.println("No Employee Found");

					break;

				// EXIT
				case 6:

					con.close();
					sc.close();

					System.out.println("Program Closed");
					return;

				default:
					System.out.println("Invalid Choice");
				}
			}

		} catch (SQLException e) {
			e.getMessage();
		}
	}
}
