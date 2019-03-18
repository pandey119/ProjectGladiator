package com.lti.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.lti.admin.dao.AdminDao;
import com.lti.admin.dto.AddQuestionDTO;
import com.lti.admin.dto.StudentLoginDTO;
import com.lti.admin.service.AddQuestionService;
import com.lti.admin.service.RemoveQuestionService;
import com.lti.admin.service.ViewReportService;
import com.lti.entity.Performance;
import com.lti.entity.ReportCard;
import com.lti.entity.StudentLogin;
import com.lti.generics.GenericDao;
import com.lti.user.dao.StudentLoginDao;
import com.lti.user.service.StudentLoginService;

public class TestAddQuestion {

	@Test
	public void test() {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/spring-config.xml");
		AddQuestionService service = (AddQuestionService) ctx.getBean("addQuestionService");
		AddQuestionDTO dto = new AddQuestionDTO();
		dto.setLevelName("level1");
		dto.setQuestion("What is g1?");
		String[] options = { "garbage collector", "raone", " none", "both" };
		dto.setOptions(options);
		dto.setRightOptionNumber(1);
		dto.setSubjectName("JAVA");
		service.add(dto);

	}

	@Test
	public void testRemove() {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/spring-config.xml");
		RemoveQuestionService service = (RemoveQuestionService) ctx.getBean("removeQuestionService");

		service.removeQuestion(21);

	}

	@Test
	public void testViewAll() {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/spring-config.xml");
		ViewReportService service = (ViewReportService) ctx.getBean("viewReportService");
		List<ReportCard> list = service.view();
		for (ReportCard reportCard : list) {
			System.out.println(reportCard.getScore());

		}
	}

	@Test
	public void testLogin() {
		StudentLoginDTO s = new StudentLoginDTO();
		// s.setUsername()
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/spring-config.xml");
		StudentLoginService service = (StudentLoginService) ctx.getBean("studentLoginService");
		service.isValid(s);

	}

	@Test
	public void testReportCard() {
		ReportCard card = new ReportCard();
		card.setScore(65);
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/spring-config.xml");
		GenericDao dao = (GenericDao) ctx.getBean("genericDao");
		dao.save(card);

	}

	@Test
	public void testSpecific() {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/spring-config.xml");
		AdminDao dao = (AdminDao) ctx.getBean("adminDao");
		List<Performance> list = dao.viewSpecifically("level1", "java");
		

		
		
		}
	@Test
	public void testStudent() {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/spring-config.xml");
		GenericDao dao = (GenericDao) ctx.getBean("genericDao");
		StudentLogin in=new StudentLogin();
		in.setUsername("mintu@gmail.com");
		in.setPassword("1234");
		dao.save(in);
		
	}
	@Test
	public void testStudentdao() {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/spring-config.xml");
		StudentLoginDao dao = (StudentLoginDao) ctx.getBean("studentLoginDao");
		StudentLogin i=new StudentLogin();
		i.setUsername("mintu@gmail.com");
		i.setPassword("1234");
		//int j=dao.check(i);
	//	System.out.println(j);
		
		
	}

}
