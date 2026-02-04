package com.school;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();

		students.add(new Student("Aarav Sharma", 1, "Aarav", 18, "Male", "Delhi", 1,
				List.of(9876543210L, 9876543211L, 9876543212L), "Computer Science"));

		students.add(new Student("Ananya Singh", 2, "Ananya", 19, "Female", "Mumbai", 2,
				List.of(9876543211L, 9876543212L, 9876543213L), "Information Technology"));

		students.add(new Student("Rohan Kumar", 3, "Rohan", 20, "Male", "Bangalore", 3,
				List.of(9876543212L, 9876543213L, 9876543214L), "Mechanical"));

		students.add(new Student("Isha Patel", 4, "Isha", 18, "Female", "Ahmedabad", 4,
				List.of(9876543213L, 9876543214L, 9876543215L), "Civil"));

		students.add(new Student("Vivaan Mehta", 5, "Vivaan", 21, "Male", "Pune", 5,
				List.of(9876543214L, 9876543215L, 9876543216L), "Electrical"));

		students.add(new Student("Saanvi Reddy", 6, "Saanvi", 19, "Female", "Hyderabad", 6,
				List.of(9876543215L, 9876543216L, 9876543217L), "Electronics"));

		students.add(new Student("Aditya Rao", 7, "Aditya", 22, "Male", "Chennai", 7,
				List.of(9876543216L, 9876543217L, 9876543218L), "Computer Science"));

		students.add(new Student("Aarya Kapoor", 8, "Aarya", 18, "Female", "Kolkata", 8,
				List.of(9876543217L, 9876543218L, 9876543219L), "Information Technology"));

		students.add(new Student("Kabir Jain", 9, "Kabir", 20, "Male", "Jaipur", 9,
				List.of(9876543218L, 9876543219L, 9876543220L), "Mechanical"));

		students.add(new Student("Tanya Verma", 10, "Tanya", 19, "Female", "Lucknow", 10,
				List.of(9876543219L, 9876543220L, 9876543221L), "Civil"));

		students.add(new Student("Arjun Nair", 11, "Arjun", 21, "Male", "Kochi", 11,
				List.of(9876543220L, 9876543221L, 9876543222L), "Electronics"));

		students.add(new Student("Diya Sharma", 12, "Diya", 18, "Female", "Delhi", 12,
				List.of(9876543221L, 9876543222L, 9876543223L), "Electronics"));

		students.add(new Student("Shaurya Singh", 13, "Shaurya", 29, "Male", "Pune", 13,
				List.of(9876543222L, 9876543223L, 9876543224L), "Computer Science"));

		students.add(new Student("Mira Gupta", 14, "Mira", 19, "Female", "Bangalore", 14,
				List.of(9876543223L, 9876543224L, 9876543225L), "Information Technology"));

		students.add(new Student("Krishna Das", 15, "Krishna", 25, "Male", "Hyderabad", 15,
				List.of(9876543224L, 9876543225L, 9876543226L), "Mechanical"));

		students.add(new Student("Nisha Choudhary", 16, "Nisha", 18, "Female", "Pune", 16,
				List.of(9876543225L, 9876543226L, 9876543227L), "Civil"));

		students.add(new Student("Yash Mehra", 17, "Yash", 21, "Male", "Chennai", 17,
				List.of(9876543226L, 9876543227L, 9876543228L), "Electrical"));

		students.add(new Student("Pooja Rani", 18, "Pooja", 20, "Female", "Kolkata", 18,
				List.of(9876543227L, 9876543228L, 9876543229L), "Electronics"));

		students.add(new Student("Ritvik Saxena", 19, "Ritvik", 19, "Male", "Jaipur", 19,
				List.of(9876543228L, 9876543229L, 9876543230L), "Computer Science"));

		students.add(new Student("Sakshi Sharma", 20, "Sakshi", 18, "Female", "Lucknow", 20,
				List.of(9876543229L, 9876543230L, 9876543231L), "Information Technology"));

		// Basic Filtering & Mapping
		// 1.Print all students whose rank is less than 10.

		List<String> list = students.stream().filter(x -> x.getRank() <= 10).map(Student::getName)
				.collect(Collectors.toList());
		list.forEach(System.out::println);

		System.out.println("**************************************************************************************");
		// 2.Print all students whose age is greater than 15

		students.stream().filter(x -> x.getAge() > 15).map(Student::getName).forEach(System.out::println);

		System.out.println("**************************************************************************************");

		// 3.Print the names of all students only

		students.stream().map(Student::getName).forEach(System.out::println);
		System.out.println("**************************************************************************************");

		// 4.Print all students belonging to Mechanical Engineering.
		students.stream().filter(x -> x.getDepartment().equals("Mechanical"))
				.forEach(x -> System.out.println(x.getFirstName()));
		System.out.println("**************************************************************************************");

		// 5.Print all students not from Mumbai.

		students.stream().filter(x -> x.getCity().equals("Mumbai")).map(Student::getName).forEach(System.out::println);
		System.out.println("**************************************************************************************");

		// Sorting & Limiting
		// 1.Sort students by rank (ascending)
		students.stream().sorted(Comparator.comparingInt(Student::getRank))
				.forEach(x -> System.out.println(x.getName()));

		System.out.println("**************************************************************************************");

		// 2.Sort students by age (descending).
		students.stream().sorted(Comparator.comparingInt(Student::getAge).reversed())
				.forEach(x -> System.out.println(x.getName()));

		// 3.Print top 5 students based on rank
		students.stream().sorted(Comparator.comparingInt(Student::getRank)).limit(5)
				.forEach(x -> System.out.println(x.getName()));

		System.out.println("**************************************************************************************");

		// 4.Print last 3 students based on rank.
		students.stream().sorted(Comparator.comparingInt(Student::getRank).reversed()).limit(3)
				.forEach(x -> System.out.println(x.getName()));

		System.out.println("**************************************************************************************");

		// 5.Print students sorted by name and then rank.
		students.stream().sorted(Comparator.comparing(Student::getName).thenComparingInt(Student::getRank))
				.forEach(x -> System.out.println(x.getName()));
		System.out.println("**************************************************************************************");

		// Grouping & Aggregation
		// 1.Count the number of students in each department.
		System.out.println(
				students.stream().collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting())));
		System.out.println("**************************************************************************************");

		// 2.Count the number of students in each city.

		System.out.println(students.stream().collect(Collectors.groupingBy(Student::getCity, Collectors.counting())));
		System.out.println("**************************************************************************************");

		// 3.Find the average age of students in each department
		System.out.println(students.stream()
				.collect(Collectors.groupingBy(Student::getDepartment, Collectors.averagingDouble(Student::getAge))));

		// 4.Find the average rank of students by gender.

		System.out.println(students.stream()
				.collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getRank))));
		System.out.println("**************************************************************************************");

		// 5.Find the total number of students in the organization.
		System.out.println("Total students->");
		System.out.println(students.stream().collect(Collectors.counting()));

		System.out.println("**************************************************************************************");
		// 6.Find the department with the highest average rank.

		Map<String, Double> avgByDept = students.stream()
				.collect(Collectors.groupingBy(Student::getDepartment, Collectors.averagingInt(Student::getRank)));

		avgByDept.entrySet().stream().max(Map.Entry.comparingByValue()).ifPresent(System.out::println);
		System.out.println("**************************************************************************************");

		// Min / Max / Ranking Problems
		// 1.Find the student with the best (lowest) rank.

		students.stream().min(Comparator.comparingInt(Student::getRank)).ifPresent(System.out::println);
		System.out.println("**************************************************************************************");

		// 2.Find the student with the worst (highest) rank.

		students.stream().max(Comparator.comparingInt(Student::getRank)).ifPresent(System.out::println);
		System.out.println("**************************************************************************************");

		// 3.Find the second best rank holder.
		students.stream().filter(
				s -> s.getRank() > students.stream().min(Comparator.comparingInt(Student::getRank)).get().getRank())
				.min(Comparator.comparingInt(Student::getRank)).ifPresent(System.out::println);
		System.out.println("**************************************************************************************");

		// 4.Find the third best rank holder.

		students.stream().sorted(Comparator.comparing(Student::getRank)).skip(2).limit(1).findFirst()
				.ifPresent(System.out::println);
		System.out.println("**************************************************************************************");

		// 5.Find the youngest student.
		students.stream().min(Comparator.comparingInt(Student::getAge)).ifPresent(System.out::println);
		System.out.println("**************************************************************************************");
		// 6.Find the oldest student.
		students.stream().max(Comparator.comparingInt(Student::getAge)).ifPresent(System.out::println);
		System.out.println("**************************************************************************************");

		// FlatMap & Collections
		// 1.Print all contact numbers of all students.

		students.stream().flatMap(s -> s.getContacts().stream()).forEach(System.out::println);
		System.out.println("**************************************************************************************");

		// 2.Count the total number of contact numbers.

		System.out.println("Total contact in organization");
		long count = students.stream().flatMap(s -> s.getContacts().stream()).count();
		System.out.println(count);

		System.out.println("**************************************************************************************");

		// 3..Find students who have more than one contact number.

		List<Student> result = students.stream()
				.flatMap(s -> s.getContacts().size() > 1 ? Stream.of(s) : Stream.empty()).toList();

		result.forEach(System.out::println);

		System.out.println("**************************************************************************************");

		// 4.Print unique contact numbers.

		Long countt = students.stream().flatMap(l -> l.getContacts().stream()).distinct().count();

		System.out.println(countt);

		// Conditional & Matching

		// 1.Check if any student belongs to Biotech Engineering.
		List<Student> stu = students.stream().filter(x -> x.getDepartment().equals("Biotech"))
				.collect(Collectors.toList());

		if (stu.isEmpty()) {
			System.out.println("No such students");
		} else {
			stu.forEach(System.out::println);
		}

		System.out.println("**************************************************************************************");

		// 2.Check if all students are above age 20.

		List<String> above20 = students.stream().filter(x -> x.getAge() > 20).map(Student::getName)
				.collect(Collectors.toList());
		above20.forEach(System.out::println);

		System.out.println("**************************************************************************************");

		// 3.Check if no student belongs to Civil Engineering.

		System.out.println("Student belongs to Civil Engineering");

		students.stream().filter(x -> x.getDepartment().equals("Civil")).map(Student::getName)
				.forEach(System.out::println);

		System.out.println("**************************************************************************************");

		// Gender-Based Analysis

		// 1.Count male and female students.

		System.out.println(students.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.counting())));

		System.out.println("**************************************************************************************");

		// 2.Find the average age of male students.

		System.out.println(students.stream().filter(x -> x.getGender().equals("Male"))
				.collect(Collectors.averagingInt(Student::getAge)));

		System.out.println("**************************************************************************************");

		// 3.Find the average age of female students

		System.out.println(students.stream().filter(x -> x.getGender().equals("Female"))
				.collect(Collectors.averagingInt(Student::getAge)));

		System.out.println("**************************************************************************************");

		// 4.Find the highest ranked male student.
		System.out.println(students.stream().filter(x -> x.getGender().equals("Male"))
				.min(Comparator.comparingInt(Student::getRank)).get());

		System.out.println("**************************************************************************************");

		// 5.Find the highest ranked female student.
		System.out.println(students.stream().filter(x -> x.getGender().equals("Female"))
				.min(Comparator.comparingInt(Student::getRank)).get());

		System.out.println("**************************************************************************************");

		// Department-Specific Queries
		// 1.List students department-wise with names only.

		Map<String, List<String>> departmentList = students.stream().collect(Collectors
				.groupingBy(Student::getDepartment, Collectors.mapping(Student::getDepartment, Collectors.toList())));

		departmentList.forEach((d, s) -> {
			System.out.println(d + " -> " + s);
			System.out.println();
		});
		System.out.println("**************************************************************************************");

		// 2.Find the youngest student in Computer Science Engineering.
		System.out.println(students.stream().filter(x -> x.getDepartment().equals("Computer Science"))
				.min(Comparator.comparing(Student::getAge)).get());
		System.out.println("**************************************************************************************");

		// 3.Find the top-ranked student in Mechanical Engineering.

		System.out.println(students.stream().filter(x -> x.getDepartment().equals("Mechanical"))
				.min(Comparator.comparingInt(Student::getRank)).get());
		System.out.println("**************************************************************************************");

		// 4.Count students in Electronics Engineering from Kochi.
		System.out.println(students.stream().filter(x -> x.getDepartment().equals("Electronics"))
				.filter(x -> x.getCity().equals("Kochi")).count());
		System.out.println("**************************************************************************************");

		// Advanced Level
		// 1.Convert the student list into a Map<Id, Name>.

		Map<Integer, String> mp = students.stream().collect(Collectors.toMap(Student::getId, Student::getName));

		mp.forEach((i, n) -> {
			System.out.println(i + " : " + n);
		});

		System.out.println("**************************************************************************************");

		// 2.Convert the student list into a Map<Department, List<Student>>.

		Map<String, List<String>> deptList = students.stream().collect(Collectors.groupingBy(Student::getDepartment,
				Collectors.mapping(Student::getName, Collectors.toList())));

		deptList.forEach((d, n) -> {
			System.out.println(d + " : " + n);
		});
		System.out.println("**************************************************************************************");

		// 3.Find students whose name starts with ‘S’.
		students.stream().filter(s -> s.getFirstName().startsWith("S")).collect(Collectors.toList())
				.forEach(System.out::println);
		System.out.println("**************************************************************************************");

		// 4.Find students whose name length is greater than 5.

		students.stream().filter(x -> x.getFirstName().length() > 5).collect(Collectors.toList())
				.forEach(System.out::println);

		System.out.println("**************************************************************************************");

		// 5.Find students whose rank is even.
		students.stream().filter(x -> x.getRank() % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("**************************************************************************************");

		// 6.6.Find students whose rank is odd.
		students.stream().filter(x -> x.getRank() % 2 != 0).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("**************************************************************************************");

		// Bonus Challenges
		// 1.Find the top 3 youngest students.
		students.stream().sorted(Comparator.comparing(Student::getAge)).limit(3).toList().forEach(System.out::println);

		System.out.println("**************************************************************************************");

		// 2.Find the top 3 oldest students.
		students.stream().sorted(Comparator.comparing(Student::getAge).reversed()).limit(3).toList()
				.forEach(System.out::println);
		System.out.println("**************************************************************************************");

		// 3.Partition students based on age > 25.
		students.stream().collect(Collectors.partitioningBy(x -> x.getAge() > 25))
				.forEach((k, v) -> System.out.println((k ? "Age > 25" : "Age <= 25") + " -> " + v));
		System.out.println("**************************************************************************************");

		// 4.Partition students based on rank < 10.
		students.stream().collect(Collectors.partitioningBy(x -> x.getRank() < 10)).forEach((k, v) -> {
			System.out.println((k ? "Rank>10 " : "Rank<=10") + " : " + v);

		});
		System.out.println("**************************************************************************************");

		// 5.Find the city having maximum students.

		Map<String, Long> cityMap = students.stream()
				.collect(Collectors.groupingBy(Student::getCity, Collectors.counting()));

		cityMap.entrySet().stream().max(Map.Entry.comparingByValue()).ifPresent(
				e -> System.out.println("City with max students: " + e.getKey() + " (" + e.getValue() + ")"));
		System.out.println("**************************************************************************************");

	}

}
