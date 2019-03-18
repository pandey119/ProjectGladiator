package com.lti.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Register;
import com.lti.entity.ReportCard;
import com.lti.generics.GenericDao;

@Service
public class StoreScoreService {
	@Autowired
	GenericDao genericDao;
	public void storeScore(int score,String levelName,String subjectName,Register student) {
		ReportCard reportCard=new  ReportCard();
		reportCard.setLevelName(levelName);
		reportCard.setSubjectName(subjectName);
		reportCard.setInfo(student);
		reportCard.setScore(score);
		genericDao.save(reportCard);
		
	}

}
