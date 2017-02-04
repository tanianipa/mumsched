package edu.mum.service;

import java.util.List;

import edu.mum.entity.User;

public interface UserService {
	
	void createNewUser(User user);
	
	List<User> findAllUsers();

}
