package com.lti.generics;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Question;


@Repository
public class GenericDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public Object save(Object obj) {
		Object o = entityManager.merge(obj);
		return o;
	}

	// using generics helps to avoid having to typecast when calling the method
	// later
	// generics help downcasting i.e. typecasting
	public <T> T fetch(Class<T> clazz, Object pk) { // will fetch a single record of a table acc to ID
		T t=entityManager.find(clazz, pk);
		return t;
		
	}


	// method to obtain all records from a table
	public <T> List<T> fetchAll(Class<T> clazz) {
		
			String jpql = "select obj from " + clazz.getName() + " as obj";
			return entityManager.createQuery(jpql, clazz).getResultList();
		} 

}
