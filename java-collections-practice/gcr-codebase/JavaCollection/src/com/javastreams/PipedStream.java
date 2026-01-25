package com.javastreams;

import java.io.*;

public class PipedStream {
	public static void main(String[] args) {
		try {
			PipedOutputStream pos = new PipedOutputStream();
			PipedInputStream pis = new PipedInputStream(pos);

			WriterThread writer = new WriterThread(pos);
			ReaderThread reader = new ReaderThread(pis);

			reader.start();
			writer.start();

		} 
		catch (IOException e) {
			System.err.println("Main IOException: " + e.getMessage());
		}
	}
}