package com.reflection.jsonrepresentation;

import java.lang.reflect.Field;

class JsonUtil {

    public static String toJson(Object obj) throws Exception {

        Class<?> cls = obj.getClass();
        Field[] fields = cls.getDeclaredFields();

        StringBuilder json = new StringBuilder("{");

        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            field.setAccessible(true);

            json.append("\"").append(field.getName()).append("\":");

            Object value = field.get(obj);

            if (value instanceof String) {
                json.append("\"").append(value).append("\"");
            } else {
                json.append(value);
            }

            if (i < fields.length - 1) {
                json.append(", ");
            }
        }

        json.append("}");
        return json.toString();
    }
}
