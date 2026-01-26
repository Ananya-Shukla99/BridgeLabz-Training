package com.annotation.deprecated;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		LegacyAPI api = new LegacyAPI();

		api.oldFeature();

		api.newFeature(); 
	}
}
