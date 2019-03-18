package com.lti.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.admin.dao.AdminDao;
import com.lti.entity.ReportCard;


@Service

public class ViewReportService {
	
	@Autowired
	private AdminDao dao;
	
	public List<ReportCard> view() {
		List <ReportCard> q=dao.viewAll();
		return q;
	}
	
}
