package com.javastreams;

import java.io.*;
import java.util.Arrays;

public class ByteArrayStream {

	public static void main(String[] args) {
		String originalImagePath = "original.jpg";
		String copiedImagePath = "copied.jpg";

		try {
			// Read the original image file into a byte array
			File originalFile = new File(originalImagePath);
			FileInputStream fis = new FileInputStream(originalFile);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();

			byte[] buffer = new byte[1024];
			int bytesRead;
			while ((bytesRead = fis.read(buffer)) != -1) {
				baos.write(buffer, 0, bytesRead);
			}
			fis.close();

			byte[] imageBytes = baos.toByteArray();
			baos.close();

			// Write the byte array to a new image file
			ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
			FileOutputStream fos = new FileOutputStream(copiedImagePath);

			while ((bytesRead = bais.read(buffer)) != -1) {
				fos.write(buffer, 0, bytesRead);
			}
			bais.close();
			fos.close();

			// Verify that the new file is identical
			byte[] originalBytes = readFileToByteArray(originalImagePath);
			byte[] copiedBytes = readFileToByteArray(copiedImagePath);

			if (Arrays.equals(originalBytes, copiedBytes)) {
				System.out.println("Success! The copied image is identical to the original.");
			} else {
				System.out.println("Error: The copied image is not identical to the original.");
			}

		} catch (IOException e) {
			System.err.println("IOException occurred: " + e.getMessage());
			e.printStackTrace();
		}
	}

	private static byte[] readFileToByteArray(String filePath) throws IOException {
		File file = new File(filePath);
		FileInputStream fis = new FileInputStream(file);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		byte[] buffer = new byte[1024];
		int bytesRead;
		while ((bytesRead = fis.read(buffer)) != -1) {
			baos.write(buffer, 0, bytesRead);
		}
		fis.close();
		return baos.toByteArray();
	}
}
