package com.app.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.UserDao;
import com.app.dto.LoginRequest;
import com.app.pojos.Role;
import com.app.pojos.Users;
/*@Service usd with classes tht  provide some busnss functionalities.
*Spring context will autodetect these classes when
*annotation-based configuration and classpath scanning is used.*/

@Service 

//metadata that specifies the semantics of the transactions on a method

@Transactional
public class UserServiceImpl implements IUserService{
	
	//dependency : dao layer i/f
	@Autowired
	private UserDao userRepo;
	
	public UserServiceImpl() {
		System.out.println("---------- CTOR: "+ getClass().getName() +" -----------");
	}
	
	@Override
	public Users registerOrEditUser(Users user) {
		//update user details
		return userRepo.save(user);
	}
	
	//edit user
	@Override
	public Users edit(Users user, int userId) {
		user.setPassword(userRepo.findById(userId).get().getPassword());
		user.setId(userId);
		return userRepo.save(user);
	}
	
	
	//user authentication login details
	@Override
	public Users authenticateUser(LoginRequest request) {
				
		return userRepo.findByEmailAndPassword(request.getEmail(), request.getPassword()).get();
	}

	//fetching user role
	@Override
	public List<Users> getUsersByRole(Role role) {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}
	
	
	//fetching using email
	@Override
	public Users findByEmail(String email) {
		// TODO Auto-generated method stub
		return userRepo.findByEmail(email);
	}

	//fetch user using user id
	@Override
	public Users findById(Integer id) {
		return userRepo.findById(id).get();
	}

	//delet user using userId
	@Override
	public String deleteUserById(Integer uid) {
		userRepo.deleteById(uid);
		return "Deleted User with ID: " + uid + " successfully!";
	}
	
	//user details using emails
	@Override
	public Users getUserByEmail(String Email) {
		// TODO Auto-generated method stub
		return userRepo.findByEmail(Email);
	}
	
	
	//get user details using uName
	@Override
	public List<Users> getUserByName(String fname) {
		// TODO Auto-generated method stub
		return userRepo.findByFirstName(fname);
	}
    
	//count total no. of user registerd
	@Override
	public int countUsers() {
		// TODO Auto-generated method stub
		return (int) userRepo.count();
	}
		
}
