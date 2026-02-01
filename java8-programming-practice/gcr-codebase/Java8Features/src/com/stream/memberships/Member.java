package com.stream.memberships;

public class Member {

	String name;
	int ExpiryDate;

	public Member(String name, int expiryDate) {

		this.name = name;
		ExpiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", ExpiryDate=" + ExpiryDate + "]";
	}

}
