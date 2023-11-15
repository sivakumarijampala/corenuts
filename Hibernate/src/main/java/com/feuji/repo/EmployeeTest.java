package com.feuji.repo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.core.hybernet.HybernateConfigure;
import com.feuji.Entity.Employee;


public class EmployeeTest {
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(HybernateConfigure.class);
        EmployeeDAO employeeDAO=applicationContext.getBean(EmployeeDAO.class);
		Employee e=new Employee();
         e.setId(7000);
         e.setName("siv");
         e.setSalary(1000.0);
        employeeDAO.save(e);
//        employeeDAO.Read(e);
        
//        employeeDAO.update(e);
	}

}
