package com.schoolsystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {

//		Scenario 1: Student / School System

		List<Student> list = new ArrayList<>();
		list.add(new Student(null, 18, 1, 95));
		list.add(new Student("Emma", 19, 2, 90));
		list.add(new Student("Liam", 18, 3, 88));
		list.add(new Student("Sophia", 20, 4, 92));
//		1.Use a lambda expression to print a welcome message for a student.

		list.stream().forEach(x -> System.out.println("Welcome to the school " + x.getName()));

		System.out.println("____________________________________________________");
//		2.Use lambda to check if a student is pass or fail based on marks.

		list.stream().filter(x -> x.getMarks() > 50).forEach(System.out::println);

		System.out.println("____________________________________________________");
//		3.Sort students by name using lambda.

		list.stream().sorted(Comparator.comparing(x -> x.getName())).forEach(System.out::println);

		System.out.println("____________________________________________________");
//		4.Sort students by rank using lambda.

		list.stream().sorted(Comparator.comparing(x -> x.getRank())).forEach(System.out::println);

		System.out.println("____________________________________________________");
//		5.Use lambda to display students whose age is above 18.
		list.stream().filter(x -> x.getAge() > 18).forEach(System.out::println);

		System.out.println("____________________________________________________");

		Predicate<Integer> p = (x -> x >= 75);
		System.out.println(p.test(67));

		Predicate<Double> sal = x -> x > 30000;
		System.out.println(sal.test(40000.0));

		Function<Integer, Character> fun = (x) -> {
			if (x > 80)
				return 'A';
			else if (x > 70)
				return 'B';
			else
				return 'C';
		};

		System.out.println(fun.apply(98));

		Function<Double, Double> f2 = x -> {
			return (x * 12);
		};
		System.out.println(f2.apply(20.0));
		
		Function<Double, Double> discount = x -> {
			return x - (x * 0.1);
		};
		System.out.println(discount.apply(200.2));

		Function<String, String> upper = x -> {
			return x.toUpperCase();
		};
		System.out.println(upper.apply("ananya"));

		Consumer<String> con = x -> {
			System.out.println(x);
		};
		con.accept("Hello");

		Supplier<String> sp = () -> {
			return "Hello World";
		};

		con.accept(sp.get());

		Comparator<Integer> cm = (x, y) -> y - x;

		List<Integer> li = Arrays.asList(2, 4, 5, 6, 7, 8, 9);

		li.sort(cm);
		System.out.println(li);

	}
}
