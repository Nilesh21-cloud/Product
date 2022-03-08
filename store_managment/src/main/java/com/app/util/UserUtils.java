package com.app.util;

import com.app.pojos.Role;
import com.app.pojos.Users;

public class UserUtils {
	
	private int currentUserId;
	private String currentUserEmail;
	private Role currentUserRole;
	
public UserUtils() {
	// TODO Auto-generated constructor stub
	System.out.println("in side userUtils ");
}

public UserUtils(int currentUserId, String currentUserEmail, Role currentUserRole) {
	super();
	this.currentUserId = currentUserId;
	this.currentUserEmail = currentUserEmail;
	this.currentUserRole = currentUserRole;
}

public int getCurrentUserId() {
	return currentUserId;
}

public void setCurrentUserId(int currentUserId) {
	this.currentUserId = currentUserId;
}

public String getCurrentUserEmail() {
	return currentUserEmail;
}

public void setCurrentUserEmail(String currentUserEmail) {
	this.currentUserEmail = currentUserEmail;
}

public Role getCurrentUserRole() {
	return currentUserRole;
}

public void setCurrentUserRole(Role currentUserRole) {
	this.currentUserRole = currentUserRole;
}

public void getCurrentUser(Users u) {
	this.currentUserId=u.getId();
	this.currentUserEmail=u.getEmail();
	this.currentUserRole=u.getRole();
}

@Override
public String toString() {
	return String.format("UserUtils [currentUserId=%s, currentUserEmail=%s, currentUserRole=%s]", currentUserId,
			currentUserEmail, currentUserRole);
}




}
