package com.csvdata.encryptdecrypt;

import java.io.*;

public class WriteEncryptedCSV {

	public static void write(String file) throws Exception {
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));

		writer.write("id,name,email,salary");
		writer.newLine();

		writer.write("1,Alice," + CryptoUtil.encrypt("alice@gmail.com") + "," + CryptoUtil.encrypt("50000"));
		writer.newLine();

		writer.write("2,Bob," + CryptoUtil.encrypt("bob@yahoo.com") + "," + CryptoUtil.encrypt("60000"));
		writer.newLine();

		writer.close();
	}
}
