package com.markerInterface.backup;

public class UserData implements Backupable {

	String name;
	int age;

	public UserData(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserData [username=" + name + ", age=" + age + "]";
	}
}