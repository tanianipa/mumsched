package edu.mum.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import edu.mum.entity.Block;
import edu.mum.entity.Faculty;

@Repository
public class FacultyDAOImpl extends AbstractDAO<Integer, Faculty> implements FacultyDAO {

	@Override
	public Boolean updateFaculty(Faculty faculty) {
		Session session;
		session = this.getSession();
		session.update(faculty);
		return null;

	}

	@Override
	public Faculty getFacultyById(String id) { // search by email
		Session session;
		session = this.getSession();

		id = id.concat(".edu");// concat .edu as email get as example@mum // Bug

		System.out.println("id:" + id);

		String SQL_QUERY = " from Faculty o where o.email=:id";
		Query query = session.createQuery(SQL_QUERY);
		query.setParameter("id", id);

		Faculty fac = (Faculty) query.uniqueResult();
		return fac;
	}

	@Override
	public List<Faculty> findFaculty() {
		// TODO Auto-generated method stub
		return null;
	}

}
