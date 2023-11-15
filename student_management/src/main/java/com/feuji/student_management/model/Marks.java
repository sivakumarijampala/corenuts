package com.feuji.student_management.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

@Entity
@Table(name="marks")
@Component
public class Marks {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="marks_id")
	private int marksId;
	
	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="student_id",referencedColumnName = "student_id",nullable = false)
	private Student  student;
	
	@Column(name="subject_1")
	private int subject1;
	
	@Column(name="subject_2")
	private int subject2;
	
	@Column(name="subject_3")
	private int subject3;
	
	@Column(name="total_marks")
	private int totalMarks;
	
	@Transient
	private Double percentage;
	
	public Double getPercentage() {
		return percentage;
	}
	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}
	
	
	public Marks() {
		super();
	}
	
	public Marks(int marksId, Student student, int subject1, int subject2, int subject3, int totalMarks) {
		super();
		this.marksId = marksId;
		this.student = student;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.totalMarks = totalMarks;
	}
	public Marks(int marksId, Student student, int subject1, int subject2, int subject3, int totalMarks,
			Double percentage) {
		super();
		this.marksId = marksId;
		this.student = student;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.totalMarks = totalMarks;
		this.percentage = percentage;
	}
	
	public int getMarksId() {
		return marksId;
	}
	public void setMarksId(int marksId) {
		this.marksId = marksId;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
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
	public int getSubject3() {
		return subject3;
	}
	public void setSubject3(int subject3) {
		this.subject3 = subject3;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	

}
