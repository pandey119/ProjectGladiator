package com.lti.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Question;
import com.lti.user.dao.UserDao;
@Service

public class FetchQuestionService {
	@Autowired
	private UserDao userDao;
	public List<Question> fetchQuestion(String levelName,String subjectName) {
		return userDao.retieveQuestions(levelName, subjectName);
		
	}

}
