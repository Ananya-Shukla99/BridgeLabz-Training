package com.reflection.dependencyinjection;

import java.lang.reflect.Field;

class DIContainer {

	public static void injectDependencies(Object obj) throws Exception {

		Class<?> cls = obj.getClass();

		for (Field field : cls.getDeclaredFields()) {

			if (field.isAnnotationPresent(Inject.class)) {

				Object dependency = field.getType().getDeclaredConstructor().newInstance();

				field.setAccessible(true);
				field.set(obj, dependency);
			}
		}
	}
}
