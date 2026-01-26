package com.reflection.dynamicallycreateobjects;

import java.lang.reflect.Constructor;

public class CreateObjectDynamically {

	public static void main(String[] args) {
		try {
			Class<?> cls = Class.forName("com.reflection.Student");

			Object obj1 = cls.getDeclaredConstructor().newInstance();

			Constructor<?> constructor = cls.getDeclaredConstructor(int.class, String.class);

			Object obj2 = constructor.newInstance(101, "Ananya");

			Student s1 = (Student) obj1;
			Student s2 = (Student) obj2;

			s1.display();
			s2.display();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
