package com.feuji.student_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.feuji.student_management.model.Marks;
import com.feuji.student_management.model.Student;
import com.feuji.student_management.model.StudentAlias;
import com.feuji.student_management.repo.MarksDao;
import com.feuji.student_management.repo.StudentDao;
import com.feuji.student_management.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	MarksDao marks;
	
	@Autowired
	StudentService studentService;
	@Autowired
	StudentDao stuDao;
	
	
	
	//creating student
	@RequestMapping("/studentPage")
	public ModelAndView showStudentPage() {
		return new ModelAndView("AddStudent","obj",new StudentAlias());
	}

	
	
	//inserting student
	@RequestMapping(value="/insert"  )
	public ModelAndView insertStudent(@ModelAttribute StudentAlias studentAlias) {
		studentService.insertStudentDetails(studentAlias);
		return new ModelAndView("DisplayStudent","obj",studentAlias);
			
	}
	
	

	//retriving records from data base
	@RequestMapping(value="/retrive")
	public ModelAndView retrive() {	
		List<StudentAlias> list=studentService.getAll();
	 return new ModelAndView("StudentDetails", "obj",list );
		
	}

      //deleting records 
		@RequestMapping("/delete")
	  public ModelAndView delete(@RequestParam int id) {
		studentService.delete(id);
		List<StudentAlias> list=studentService.getAll();
		return new ModelAndView("StudentDetails", "obj",list);
		
	}
	
	
	
	

}
