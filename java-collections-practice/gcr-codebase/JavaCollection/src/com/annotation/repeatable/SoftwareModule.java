package com.annotation.repeatable;

public class SoftwareModule {

	@BugReport(description = "Null pointer exception on login")
	@BugReport(description = "UI not responsive on clicking submit")
	public void launchModule() {
		System.out.println("Module launched.");
	}
}
