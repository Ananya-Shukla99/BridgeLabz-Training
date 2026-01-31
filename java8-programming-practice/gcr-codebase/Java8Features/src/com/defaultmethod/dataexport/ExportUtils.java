package com.defaultmethod.dataexport;

@FunctionalInterface
public interface ExportUtils {

	void export(String data);
	default void exportToJSON(String data) {
		System.out.println("File exported to JSON format !");
	}
}
