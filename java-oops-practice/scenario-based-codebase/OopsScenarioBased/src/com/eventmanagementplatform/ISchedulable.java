package com.eventmanagementplatform;

public interface ISchedulable {

	//method
	void schedule();
    void reschedule(String newDate);
    void cancel();
	
}
