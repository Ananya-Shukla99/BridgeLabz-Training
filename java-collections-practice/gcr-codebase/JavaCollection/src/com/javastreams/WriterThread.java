package com.javastreams;

import java.io.*;

class WriterThread extends Thread {
	
    private PipedOutputStream pos;

    public WriterThread(PipedOutputStream pos) {
        this.pos = pos;
    }

    @Override
    public void run() {
        try {
            String message = "Hello from Writer Thread!";
            pos.write(message.getBytes());
            pos.close(); 
            }
        catch (IOException e) {
            System.err.println("Writer IOException: " + e.getMessage());
        }
    }
}