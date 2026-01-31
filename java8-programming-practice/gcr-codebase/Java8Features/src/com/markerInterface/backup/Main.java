package com.markerInterface.backup;

public class Main {

	public static void main(String[] args) {

        UserData user = new UserData("Ananya", 25);
        TempData temp = new TempData("Session cache");

        BackupService.backup(user); 
        BackupService.backup(temp); 
    }
}
