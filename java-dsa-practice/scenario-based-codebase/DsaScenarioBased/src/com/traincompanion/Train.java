package com.traincompanion;

public class Train {

	public Compartment head;
	public Compartment tail;
	public Compartment current;

	// added a compartment
	public void addCompartent(Compartment c) {

		// first compartment
		if (head == null) {
			head = tail = c;
			current = head;
			System.out.println("First compartment added : " + c.getName());
			return;
		} else {
			tail.next = c;
			c.prev = tail;
			tail = c;
			System.out.println("Compartment added : " + c.getName());
		}
	}

	// remove compartment
	public void removeCompartment(Compartment c) {

		if (head == null) {
			System.out.println("Train has no compartment");
			return;
		}

		Compartment temp = head;

		while (temp != null) {

			if (temp.id == c.id) {

				// If current is being removed, move it
				if (current == temp) {
					if (temp.next != null)
						current = temp.next;
					else
						current = temp.prev;
				}

				// If removing head
				if (temp == head) {
					head = temp.next;
					if (head != null)
						head.prev = null;
				}

				// If removing tail
				else if (temp == tail) {
					tail = temp.prev;
					tail.next = null;
				}

				// If removing middle
				else {
					temp.prev.next = temp.next;
					temp.next.prev = temp.prev;
				}

				System.out.println("Compartment removed: " + temp.getName());
				return;
			}

			temp = temp.next;
		}

		System.out.println("Compartment not found");
	}

	// move forward
	public void moveForward() {

		if (current == null) {
			System.out.println("No compartments");
			return;
		}
		if (current.next == null) {
			System.out.println(current.getName() + " is the last compartment");
		} else {
			current = current.next;
			System.out.println("Moved to " + current.getName());
		}
	}

	// move forward
	public void moveBackward() {

		if (current == null) {
			System.out.println("No compartments");
			return;
		}
		if (current.prev == null) {
			System.out.println(current.getName() + " is the first compartment");
		} else {
			current = current.prev;
			System.out.println("Moved to " + current.getName());
		}
	}

	// Display adjacent compartments for quick decisions
	public void adjacentShow(Compartment c) {
		if (current == null)
			return;

		if (c.next == null) {
			System.out.println("This compartment is " + c.getName());
			System.out.println("No next compartment, this is the last one");
			System.out.println("The previous compartment is  " + c.prev.getName());
		} else if (c.prev == null) {
			System.out.println("This compartment is " + c.getName());
			System.out.println("No privious compartment, this is the first one");
			System.out.println("The next compartment is  " + c.next.getName());
		} else {
			System.out.println("This compartment is " + c.getName());
			System.out.println("The previous compartment is " + c.prev.getName());
			System.out.println("The next compartment is  " + c.next.getName());
		}
	}
}
