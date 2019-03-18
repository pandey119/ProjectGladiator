package com.lti.admin.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.admin.service.ViewReportService;
import com.lti.entity.ReportCard;

@Controller
public class ViewReportController {
	@Autowired
	private ViewReportService viewReportService ;
	@RequestMapping(path="/viewQuestionController", method=RequestMethod.GET)
	public String viewQuestion(Map <String,Object> model) {  
		List <ReportCard> list=viewReportService.view();
		model.put("viewReports", list);
		System.out.println(model.get(list));
		return "/viewReports.jsp";
	
	

}
	
}
