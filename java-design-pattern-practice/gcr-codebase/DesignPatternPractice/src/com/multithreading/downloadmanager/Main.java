package com.multithreading.downloadmanager;

public class Main {
	public static void main(String[] args) {

        // Create download threads
        FileDownloader d1 = new FileDownloader("Document.pdf");
        FileDownloader d2 = new FileDownloader("Image.jpg");
        FileDownloader d3 = new FileDownloader("Video.mp4");
        
        //start thread
        d1.start();
        d2.start();
        d3.start();
        
        try {
        	//wait for all download
        	d1.join();
        	d2.join();
        	d3.join();
        	
        }catch(InterruptedException e) {
        	e.printStackTrace();
        }
        System.out.println("All download completed !");
	}
}
