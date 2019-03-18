package com.lti.user.dao;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.entity.Performance;
import com.lti.entity.Question;
import com.lti.entity.ReportCard;
import com.lti.entity.Register;
import com.lti.generics.GenericDao;

@Repository
public class UserDao {
	@PersistenceContext
	EntityManager entityManager;
	@Autowired
	GenericDao dao;
	
	public List<Question>  retieveQuestions(String levelName , String subjectName){
	
		String sql="select distinct q from Question q join fetch q.options where q.levelName=:levelName and q.subjectName=:subjectName";
		
		Query q=entityManager.createQuery(sql);
		q.setParameter("levelName", levelName);
		q.setParameter("subjectName", subjectName);
	List <Question> questions= q.getResultList();
		return questions;
				
	}
   List<Register> personalInfo(){
	String sql="select obj from studentInfo as obj";
	Query q=entityManager.createQuery(sql);
	
	List<Register> info=q.getResultList();
	return info;
}


public void update(Register info) {
	dao.save(info);	
}
public void addScore(int score) {
	ReportCard reportCard=new ReportCard();
	reportCard.setRid(score);
	entityManager.merge(reportCard);
}
public void addPerformance(Performance performance) {
	entityManager.merge(performance);
		
}
public List<Performance> showPerformance(){
	String sql="select obj from Performance as obj";
	Query q=entityManager.createQuery(sql);
	return q.getResultList();
}
}
