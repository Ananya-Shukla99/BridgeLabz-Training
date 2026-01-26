package com.reflection.customobject;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws Exception {

		Map<String, Object> map = new HashMap<>();
		map.put("id", 101);
		map.put("name", "Alice");

		Student s = ObjectMapper.toObject(Student.class, map);
		s.show();
	}
}
