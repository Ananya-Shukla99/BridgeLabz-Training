package com.multithreading.downloadmanager;

import java.util.Random;

public class FileDownloader extends Thread {
	
	private String fileName;
	
	private Random random = new Random();
	
	//constructor
	public FileDownloader (String fileName) {
		this.fileName=fileName;
	}
	
	@Override
	public void run() {
		try {
			for(int i=0; i<100; i+=10) {
				//buffer time in downloads
				Thread.sleep(random.nextInt(400)+100);
				
				//printing the status 
				System.out.println(getName() + " Downloading "
                        + fileName + ": " + i + "%");
			}
		}
		catch(InterruptedException e ){
			System.out.println("Download interruption : "+fileName);
		}
	}

}
