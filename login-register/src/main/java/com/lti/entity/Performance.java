package com.lti.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Performance {
	
	@Id
	@GeneratedValue
	int pid;
	
	private int optionByStudent;
	private String correctOption;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Question> question;
	
	
	public List<Question> getQuestion() {
		return question;
	}
	public void setQuestion(List<Question> question) {
		this.question = question;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getOptionByStudent() {
		return optionByStudent;
	}
	public void setOptionByStudent(int optionByStudent) {
		this.optionByStudent = optionByStudent;
	}
	public String getCorrectOption() {
		return correctOption;
	}
	public void setCorrectOption(String correctAnswer) {
		this.correctOption = correctAnswer;
	}

	}
