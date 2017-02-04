package edu.mum.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.mum.entity.User;

@Repository
public class UserDAOImpl extends AbstractDAO<Integer, User> implements UserDAO {

	public void createNewUser(User user) {
		persist(user);
	}

	public List<User> findUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
