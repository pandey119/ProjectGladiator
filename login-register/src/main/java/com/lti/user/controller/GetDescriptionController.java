package com.lti.user.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.lti.user.service.DescriptionService;

@Controller
public class GetDescriptionController {
	@Autowired
	private DescriptionService descriptionService;
	@RequestMapping(path = "/getDescription", method = RequestMethod.GET)
	public String fetch(int pid) {
		descriptionService.getDescription(pid);
		
		return "/description.jsp";
		
	}

}
