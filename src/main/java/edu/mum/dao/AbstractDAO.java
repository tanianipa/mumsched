package edu.mum.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDAO<PK extends Serializable, T> {

	private final Class<T> persistentClass;

	@SuppressWarnings("unchecked")
	public AbstractDAO() {
		this.persistentClass = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass())
				.getActualTypeArguments()[1];
	}

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	public T findById(PK key) {
		return (T) getSession().get(persistentClass, key);
	}

	public void persist(T entity) {
		getSession().persist(entity);
	}

	public void update(T entity) {
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&");
		getSession().update(entity);
	}

	public void delete(T entity) {
	
		getSession().delete(entity);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return getSession().createQuery("from " + persistentClass.getName()).list();
	}

}