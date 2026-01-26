package com.annotation.importantmethod;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Define custom annotation
@Retention(RetentionPolicy.RUNTIME)
@interface ImportantMethod {
	String level() default "HIGH";
}
