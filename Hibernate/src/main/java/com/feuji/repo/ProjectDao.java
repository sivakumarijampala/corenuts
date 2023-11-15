package com.feuji.repo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.feuji.Entity.Employee;
import com.feuji.Entity.Project;

@Repository
@Transactional
public class ProjectDao {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(Project p) {
		Session currentSession  = sessionFactory.getCurrentSession();
		currentSession.save(p);
	}
}
