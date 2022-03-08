package com.app.service;

import java.util.List;

import com.app.dto.LoginRequest;
import com.app.pojos.Role;
import com.app.pojos.Users;

public interface IUserService {

	//add a method to register or edit  users
	Users registerOrEditUser(Users user);

	//add a method to authenticate  users
	Users authenticateUser(LoginRequest request);

	//add a method to get user by role  
	List<Users> getUsersByRole(Role role);
	
	//add a method to find user by email Id
	Users findByEmail(String email);

	//add a method to get user dertails using UserID
	Users findById(Integer id);
	 
	//add a method to edit  users using userId
	Users edit(Users user,int userId);

	//add a method to delet  users by userid
	String deleteUserById(Integer uid);
	
	//add a method to get   users by using nme
	List<Users> getUserByName(String fname);
	
	//add a method to get  user using email
	Users getUserByEmail(String Email);
	
	//add a method to count all registerd user
	int countUsers();
	

}
