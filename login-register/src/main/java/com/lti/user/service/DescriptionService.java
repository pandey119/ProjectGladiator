package com.lti.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Performance;
import com.lti.entity.Question;
import com.lti.generics.GenericDao;

@Service
public class DescriptionService {
	@Autowired
	GenericDao genericDao;
	public void setDescription(List<Question> questions, int optionByStudent, String correctOption) {
		Performance performance=new Performance();
		performance.setQuestion(questions);
		performance.setOptionByStudent(optionByStudent);
		performance.setCorrectOption(correctOption);
		genericDao.save(performance);
		
	
	}
	public Performance getDescription(int pid) {
		return genericDao.fetch(Performance.class,pid );
		
		
	}

}
