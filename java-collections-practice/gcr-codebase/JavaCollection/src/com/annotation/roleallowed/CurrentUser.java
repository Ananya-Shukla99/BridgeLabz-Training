package com.annotation.roleallowed;

class CurrentUser {
    private String role;

    public CurrentUser(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}