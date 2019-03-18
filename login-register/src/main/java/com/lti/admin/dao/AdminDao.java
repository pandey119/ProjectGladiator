package com.lti.admin.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Performance;
import com.lti.entity.Question;
import com.lti.entity.ReportCard;
@Repository
public class AdminDao {

	@PersistenceContext
	private EntityManager entityManager;
	@Transactional
	public void delete(int id) {
	Question q=entityManager.find(Question.class, id);
		entityManager.remove(q);
	}
	public List<ReportCard> viewAll() {
		String sql = "select obj from ReportCard as obj";
		List<ReportCard> list = entityManager.createQuery(sql).getResultList(); 
		return list;
		}
public List<Performance> viewSpecifically(String levelName,String subjectName){
	Query q=entityManager.createQuery("select s.name,r.score,q.levelName,q.subjectName from StudentInfo as s , ReportCard as r,Question q where q.levelName:levelName and q.subjectName:subjectName");
	
	List<Performance> list = q.getResultList(); 
	return list;
	
}
}
