package com.csvdata.encryptdecrypt;

public class Main {
	public static void main(String[] args) throws Exception {
		WriteEncryptedCSV.write("src/com/csvdata/employees.csv");
		ReadDecryptedCSV.read("src/com/csvdata/employees.csv");
	}
}
