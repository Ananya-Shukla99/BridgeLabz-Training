package com.ambulanceroute;

public class AbulanceLinkedList {

	protected Unit head ;
	
	//constructor
	public AbulanceLinkedList() {
	}

	//adding node
	public void addUnit(Unit unit) {
		
		if(head ==null) {
			head=unit;
			unit.next=head;
			System.out.println("Added unit "+unit.name);
		}
		else {
			Unit temp = head;
			while(temp.next!=null && temp.next!=head) {
				temp=temp.next;
			}
			temp.next=unit;
			unit.next=head;
			System.out.println("Added unit "+unit.name);
		}
		
	}
	//admitting the patient 
	public void admit(Unit unit) {
		
		if(unit.avalibility ==true) {
			System.out.println("Patient is admitted in " +unit.name);
			unit.avalibility=false;
		}
		else {
			System.out.println("Sorry no beds are avalible");
		}
	}
	
	//routing to check where beds are available
	public void routePatient() {
	    if (head == null) return;

	    Unit temp = head;

	    do {
	        if (temp.avalibility) {
	            System.out.println("Patient admitted to " + temp.name);
	            temp.avalibility = false;
	            return;
	        }
	        temp = temp.next;
	    } while (temp != head);

	    System.out.println("No units available!");
	}
	
	
	//discharge from unit 
	public void discharge(Unit unit) {
		
		if(unit.avalibility ==false) {
			System.out.println("Patient is discharge from " +unit.name);
			unit.avalibility=true;
		}
		else {
			System.out.println("Sorry, no patient availible");
		}
	}
	
	//displaying the units 
	public void display () {
	    Unit temp=head;
		if(head == null) {
			System.out.println("No units avaliable");
		}
		else {
			 do{
				System.out.println("Unit : "+temp.name+ " Availiblity : "+ temp.avalibility );
				temp=temp.next;
			}while(temp!=head);
		}
	}
}
