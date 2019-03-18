package com.lti.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.admin.dto.StudentLoginDTO;
import com.lti.entity.StudentLogin;
import com.lti.user.dao.StudentLoginDao;
@Service
public class StudentLoginService {
	@Autowired
	private StudentLoginDao studentLoginDao;
	 public boolean isValid(StudentLoginDTO studentLoginDTO) {
		 StudentLogin studentLogin=new StudentLogin();
		 studentLogin.setUsername(studentLoginDTO.getUsername());
		 studentLogin.setPassword(studentLoginDTO.getPassword());
		 boolean isValid=studentLoginDao.check(studentLogin);
		 return isValid;
		 
	 }
	
	
	

}
