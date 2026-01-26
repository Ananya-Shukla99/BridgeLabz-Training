package com.reflection.executiontiming;

public class Main {

	public static void main(String[] args) throws Exception {

		Task task = new Task();

		MethodTimer.measureExecutionTime(task);
	}
}
