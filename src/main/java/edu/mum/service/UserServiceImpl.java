package edu.mum.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.dao.UserDAO;
import edu.mum.entity.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;
	
	public void createNewUser(User user) {
		userDAO.createNewUser(user);
	}
	
	public List<User> findAllUsers() {
		return new ArrayList<User>();
	}

}
