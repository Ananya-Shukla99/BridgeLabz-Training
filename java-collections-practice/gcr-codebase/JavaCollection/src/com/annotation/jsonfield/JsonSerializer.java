package com.annotation.jsonfield;

import java.lang.reflect.Field;

class JsonSerializer {
	public static String toJson(Object obj) throws IllegalAccessException {
		StringBuilder json = new StringBuilder();
		json.append("{");

		Field[] fields = obj.getClass().getDeclaredFields();
		boolean firstField = true;

		for (Field field : fields) {
			if (field.isAnnotationPresent(JsonField.class)) {
				if (!firstField) {
					json.append(", ");
				}
				field.setAccessible(true);
				JsonField annotation = field.getAnnotation(JsonField.class);
				String key = annotation.name();
				Object value = field.get(obj);
				json.append("\"").append(key).append("\": \"").append(value).append("\"");
				firstField = false;
			}
		}

		json.append("}");
		return json.toString();
	}
}