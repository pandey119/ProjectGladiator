package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="report_card")
public class ReportCard {
	@Id
	@GeneratedValue
	private int rid;
	private String levelName;
	private String subjectName;
	private double score;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private Register info;
	
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getLevelName() {
		return levelName;
	}
	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public Register getInfo() {
		return info;
	}
	public void setInfo(Register info) {
		this.info = info;
	}

	
}
