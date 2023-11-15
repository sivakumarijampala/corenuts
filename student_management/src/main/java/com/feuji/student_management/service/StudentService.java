package com.feuji.student_management.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feuji.student_management.model.Marks;
import com.feuji.student_management.model.Student;
import com.feuji.student_management.model.StudentAlias;
import com.feuji.student_management.repo.MarksDao;
import com.feuji.student_management.repo.StudentDao;


@Service
public class StudentService {
	
	
	@Autowired(required =true)
	private Student student;
	
	@Autowired(required=true)
	Marks marks;
   
	 
	@Autowired
	private StudentDao studentDao;
	
	@Autowired
	private MarksDao marksDao;
	
	@Autowired
	StudentService service;
	
	
	
	public void insertStudentDetails(StudentAlias studentAlias) {
		student.setName(studentAlias.getName());
		student.setAge(studentAlias.getAge());
		student.setStdClass(studentAlias.getStdClass());
		marks.setStudent(student);
		marks.setSubject1(studentAlias.getSubject1());
		marks.setSubject2(studentAlias.getSubject2());
		marks.setSubject3(studentAlias.getSubject3());
		int totalmarks=(int) ((studentAlias.getSubject1())+studentAlias.getSubject2()+studentAlias.getSubject3());
		marks.setTotalMarks(totalmarks);
		studentDao.saveStudent(student);
		marksDao.saveMarks(marks);	
	}
	
	  
	
	
	public List<StudentAlias> getAll(){
		List<Student> list=studentDao.get();
		System.out.println(list);
		List<StudentAlias> listal=new ArrayList<>();
		for(Student std:list) {
			StudentAlias alias=new StudentAlias();
			alias.setId(std.getId());
			alias.setName(std.getName());
			alias.setAge(std.getAge());
			alias.setStdClass(std.getStdClass());
			alias.setSubject1(std.getMarks().getSubject1());
			alias.setSubject2(std.getMarks().getSubject2());
			alias.setSubject3(std.getMarks().getSubject3());
			alias.setTotalmarks(std.getMarks().getTotalMarks());
			double percentage=service.percen(std.getMarks().getTotalMarks());
			alias.setPercentage(percentage);
			System.out.println(alias);
			listal.add(alias);
	   }
		return listal;
	}




	private double percen(int totalMarks) {
		int result=(totalMarks*100)/300;
		return result;
	}




	public void delete(int id) {
		studentDao.delete(id);
		
	}
	
	
	
		
	}
	
	
	
	
	
	
	


