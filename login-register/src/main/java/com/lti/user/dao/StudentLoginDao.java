package com.lti.user.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.entity.StudentLogin;

@Repository
public class StudentLoginDao {
	@PersistenceContext
	private EntityManager entityManager;
	public boolean check(StudentLogin studentLogin) {
		String sql="select id from StudentLogin where username= :username and password= :password";
		Query q = entityManager.createQuery(sql);
		q.setParameter("username", studentLogin.getUsername());
		q.setParameter("password", studentLogin.getPassword());
		int id = (Integer) q.getSingleResult();
	
	if(id!=0) {
			return true;
		}
		else
		return false; 
		
	}

}
