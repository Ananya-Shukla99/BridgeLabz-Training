package com.csvdata.encryptdecrypt;

import java.io.*;

public class ReadDecryptedCSV {

	public static void read(String file) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader(file));

		String line = reader.readLine();

		while ((line = reader.readLine()) != null) {
			String[] data = line.split(",");

			String id = data[0];
			String name = data[1];
			String email = CryptoUtil.decrypt(data[2]);
			String salary = CryptoUtil.decrypt(data[3]);

			System.out.println(id + " | " + name + " | " + email + " | " + salary);
		}
		reader.close();
	}
}
