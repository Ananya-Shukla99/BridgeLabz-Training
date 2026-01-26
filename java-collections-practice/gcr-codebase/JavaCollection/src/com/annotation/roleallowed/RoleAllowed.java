package com.annotation.roleallowed;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface RoleAllowed {
	String value();
}