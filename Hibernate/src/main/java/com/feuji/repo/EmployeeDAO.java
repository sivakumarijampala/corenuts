package com.feuji.repo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.core.hybernet.HybernateConfigure;
import com.feuji.Entity.Employee;


@Repository
@Transactional
public class EmployeeDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(Employee e) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(e);
	}
	
	public void Read(Employee e) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.get(Employee.class,1);
		
	}
	public void update(Employee e) {
		Session currentSession = sessionFactory.getCurrentSession();
		Employee emp=currentSession.get(Employee.class,1);
		emp.setName("siva kumari");
		currentSession.update(e);
		
	}
	public void delete(Employee e) {
		Session currSession=sessionFactory.getCurrentSession();
		
		
	}
	
	
	
}
