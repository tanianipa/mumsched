package edu.mum.dao;

import java.util.List;

import edu.mum.entity.User;

public interface UserDAO {

	void createNewUser(User user);
	
	List<User> findUsers();
	
}
