package edu.mum.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDAOImpl implements LoginDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public boolean checkLogin(String username, String password) {
		System.out.println("In Check login");
		Session session = sessionFactory.openSession();
		boolean userFound = false;
		// Query using Hibernate Query Language
		String SQL_QUERY = " from User o where o.username=:username and o.password=:password";
		Query query = session.createQuery(SQL_QUERY);
		query.setParameter("username", username);
		query.setParameter("password", password);
		List list = query.list();

		if ((list != null) && (list.size() > 0)) {
			userFound = true;
		}

		session.close();
		return userFound;
	}
}