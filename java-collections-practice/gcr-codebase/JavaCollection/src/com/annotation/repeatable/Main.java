package com.annotation.repeatable;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws Exception {
        SoftwareModule module = new SoftwareModule();
        module.launchModule();

        Method method = SoftwareModule.class.getMethod("launchModule");

        BugReport[] reports = method.getAnnotationsByType(BugReport.class);
        for (BugReport report : reports) {
            System.out.println("Bug: " + report.description());
        }
    }
}
