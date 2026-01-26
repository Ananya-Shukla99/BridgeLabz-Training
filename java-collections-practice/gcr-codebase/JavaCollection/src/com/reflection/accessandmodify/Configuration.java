package com.reflection.accessandmodify;

public class Configuration {
	 private static String API_KEY = "OLD_KEY";

	 public static String getAPI_KEY() {
		return API_KEY;
	 }

	 public static void setAPI_KEY(String aPI_KEY) {
		API_KEY = aPI_KEY;
	 }
}
