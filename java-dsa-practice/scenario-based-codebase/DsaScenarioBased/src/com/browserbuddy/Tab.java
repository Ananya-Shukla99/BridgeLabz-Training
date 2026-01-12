package com.browserbuddy;

public class Tab {

	// attribute
	protected String name;
	protected Page head;
	protected Page tail;
	protected Page curr;

	// constructor
	public Tab(String name) {
		this.name = name;
		this.head = null;
		this.tail = null;
		this.curr = null;
	}

	// add page
	public void add(Page page) {
		
		if (head == null) {
			head = tail = curr = page;
			System.out.println("first page added : " + page);
			return;
		}

		if (curr != tail) {
            Page temp = curr.next;
            while (temp != null) {
                Page next = temp.next;
                temp.prev = null;
                temp.next = null;
                temp = next;
            }
            curr.next = null;
            tail = curr;
        }
		
		tail.next = page;
        page.prev = tail;
        tail = page;
        curr = page;
	}


	// moving forward
	public void moveForward() {
		if (curr != null && curr.next != null) {
			curr = curr.next;
			System.out.println("Moved forward : " + curr);
		} else {
			System.out.println("Already at the last page");
		}
	}

	// moving backward
	public void moveBackward() {
		if (curr != null && curr.prev != null) {
			curr = curr.prev;
			System.out.println("Moved back to :" + curr);

		} else {
			System.out.println("Already on last page");
		}
	}

	// display
	public void displayHistory() {
        Page temp = head;
        while (temp != null) {
            if (temp == curr)
                System.out.print("[" + temp.url + "] <-> ");
            else
                System.out.print(temp.url + " <-> ");

            temp = temp.next;
        }
        System.out.println("null");
    }


}
