package com.stream.memberships;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<Member> members = new ArrayList<>();

		members.add(new Member("Amit", 26));
		members.add(new Member("Priya", 80));
		members.add(new Member("Rahul", 66));
		members.add(new Member("Sneha", 3));
		members.add(new Member("Sonu", 29));
		members.add(new Member("Neha", 90));
		members.add(new Member("Arjun", 24));
		members.add(new Member("Kavya", 20));

		System.out.println("List of membres :");
		
		members.forEach(System.out::println);
	    
		System.out.println("___________________________________");
		
		List<Member> list= members.stream().filter(c->c.ExpiryDate<=30).collect(Collectors.toList());
		
		list.stream().forEach(System.out::println);
	}
}
