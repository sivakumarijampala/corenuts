package com.feuji.student_management.model;

import javax.persistence.Column;
import javax.persistence.Entity;


public class StudentAlias {
	
	private int id;
	private String name;
	private int age;
	private String stdClass;
	
	private int subject1;
	private int subject2;
	private int subject3;
	private int totalmarks;
	private double percentage;
	
	public int getTotalmarks() {
		return totalmarks;
	}
	public void setTotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getStdClass() {
		return stdClass;
	}
	public void setStdClass(String stdClass) {
		this.stdClass = stdClass;
	}
	public int getSubject1() {
		return subject1;
	}
	public void setSubject1(int subject1) {
		this.subject1 = subject1;
	}
	public int getSubject2() {
		return subject2;
	}
	public void setSubject2(int subject2) {
		this.subject2 = subject2;
	}
	public StudentAlias() {
		super();
	}
	public StudentAlias(int id, String name, int age, String stdClass, int subject1, int subject2, int subject3) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.stdClass = stdClass;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
	}
	public int getSubject3() {
		return subject3;
	}
	public void setSubject3(int subject3) {
		this.subject3 = subject3;
	}
	@Override
	public String toString() {
		return "StudentAlias [id=" + id + ", name=" + name + ", age=" + age + ", stdClass=" + stdClass + ", subject1="
				+ subject1 + ", subject2=" + subject2 + ", subject3=" + subject3 + ", totalmarks=" + totalmarks
				+ ", percentage=" + percentage + "]";
	}
	
	
	
	
	

}
