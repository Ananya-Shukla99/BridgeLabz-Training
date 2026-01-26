package com.reflection.customobject;

import java.lang.reflect.Field;
import java.util.Map;

class ObjectMapper {

    public static <T> T toObject(Class<T> clazz, Map<String, Object> data)
            throws Exception {

        // Create object
        T obj = clazz.getDeclaredConstructor().newInstance();

        for (String key : data.keySet()) {
            Field field = clazz.getDeclaredField(key);
            field.setAccessible(true);
            field.set(obj, data.get(key));
        }

        return obj;
    }
}
