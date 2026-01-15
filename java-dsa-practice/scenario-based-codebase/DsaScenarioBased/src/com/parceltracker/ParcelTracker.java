package com.parceltracker;

public class ParcelTracker {

	Stage head; 

	// Add stage at end
	public void addStage(String name) {
		
        Stage newStage = new Stage(name);

        if (head == null) {
            head = newStage;
            return;
        }

        Stage temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newStage;
	}
	
	public void trackParcel() {
        Stage temp = head;

        if (temp == null) {
            System.out.println("Parcel not found!");
            return;
        }

        while (temp != null) {
            System.out.print(temp.name + " → ");
            temp = temp.next;
        }
        System.out.println("null (Delivered or Lost)");
    }
	
    public void addCheckpoint(String after, String newStage) {
        Stage temp = head;

        while (temp != null && !temp.name.equals(after)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Stage not found!");
            return;
        }

        Stage node = new Stage(newStage);
        node.next = temp.next;
        temp.next = node;
    }

    public void markLost(String stageName) {
        Stage temp = head;

        while (temp != null && !temp.name.equals(stageName)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Stage not found!");
            return;
        }

        temp.next = null;   
    }

}
