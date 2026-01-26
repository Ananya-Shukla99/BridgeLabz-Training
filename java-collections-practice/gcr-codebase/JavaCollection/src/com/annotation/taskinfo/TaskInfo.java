package com.annotation.taskinfo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface TaskInfo {
	String priority();

	String assignedTo();
}