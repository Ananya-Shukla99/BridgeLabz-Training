package com.lambda.smarthome;

import java.util.HashMap;
import java.util.Map;

class Light {

	// Storing the data in map for string and its action
	private Map<String, LightAction> triggers = new HashMap<>();

	// storing those triggers and action
	public void addTrigger(String trigger, LightAction action) {
		triggers.put(trigger, action);
	}

	// action to be execute
	public void activate(String trigger) {
		LightAction action = triggers.get(trigger);
		if (action != null) {
			action.execute();
		} else {
			System.out.println("No light behavior defined for " + trigger);
		}
	}
}
