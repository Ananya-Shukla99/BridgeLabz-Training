package com.staticmethod.password;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		// List of passwords for validation
		List<String> list = List.of("Pass@123", "Secure#9A", "MyPwd!2024", "password@1", "PASSWORD@1");

		// static method
		SecurityUtils.checkPassword(list);
	}
}
