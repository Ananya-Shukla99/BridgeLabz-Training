package com.annotation.roleallowed;

class AdminOperations {

	@RoleAllowed("ADMIN")
	public void deleteUser() {
		System.out.println("User deleted successfully!");
	}

	@RoleAllowed("USER")
	public void viewProfile() {
		System.out.println("Profile viewed!");
	}

	public void openHelp() {
		System.out.println("Help section opened.");
	}
}
