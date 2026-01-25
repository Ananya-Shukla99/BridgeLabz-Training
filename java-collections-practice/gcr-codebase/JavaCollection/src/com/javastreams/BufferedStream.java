package com.javastreams;

import java.io.*;

public class BufferedStream {

	private static final int BUFFER_SIZE = 4096;

	public static void main(String[] args) {

		String sourceFile = "largefile.dat";
		String unbufferedDest = "unbuffered_copy.dat";
		String bufferedDest = "buffered_copy.dat";

		// Unbuffered copy
		long unbufferedTime = copyUsingFileStreams(sourceFile, unbufferedDest);

		// Buffered copy
		long bufferedTime = copyUsingBufferedStreams(sourceFile, bufferedDest);

		System.out.println("\nExecution Time Comparison:");
		System.out.println("Unbuffered Streams: " + unbufferedTime + " ns");
		System.out.println("Buffered Streams  : " + bufferedTime + " ns");
	}

	// Copy using FileInputStream and FileOutputStream
	private static long copyUsingFileStreams(String source, String destination) {
		long startTime = System.nanoTime();

		try (FileInputStream fis = new FileInputStream(source);
				FileOutputStream fos = new FileOutputStream(destination)) {

			byte[] buffer = new byte[BUFFER_SIZE];
			int bytesRead;

			while ((bytesRead = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, bytesRead);
			}

		} catch (IOException e) {
			System.out.println("Error during unbuffered copy.");
		}

		return System.nanoTime() - startTime;
	}

	// Copy using BufferedInputStream and BufferedOutputStream
	private static long copyUsingBufferedStreams(String source, String destination) {
		long startTime = System.nanoTime();

		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {

			byte[] buffer = new byte[BUFFER_SIZE];
			int bytesRead;

			while ((bytesRead = bis.read(buffer)) != -1) {
				bos.write(buffer, 0, bytesRead);
			}

		} catch (IOException e) {
			System.out.println("Error during buffered copy.");
		}

		return System.nanoTime() - startTime;
	}
}
