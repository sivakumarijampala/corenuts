package com.feuji.student_management.repo;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.feuji.student_management.model.Marks;
import com.feuji.student_management.model.Student;

@Transactional
@Repository
public class MarksDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveMarks(Marks marks) {
		Session currentsession=sessionFactory.getCurrentSession();
		currentsession.save(marks);
	
	}
	public List<Marks> get(){
		Session currentsession=sessionFactory.getCurrentSession();
		CriteriaBuilder builder=currentsession.getCriteriaBuilder();
		CriteriaQuery<Marks> criteria=builder.createQuery(Marks.class);
		criteria.from(Marks.class);
		List<Marks> students=currentsession.createQuery(criteria).getResultList();
		return students;	
	}
	
	
//	public Student getmarksById(int id) {
//		Session currentSession = sessionFactory.getCurrentSession();
//		return currentSession.load(Student.class,id);
//	}
	
//	public void delete(int id) {
//		Session currentsession=sessionFactory.getCurrentSession();
//		currentsession.delete(id);
//		
//	}
//	
//	public void update(Marks marks) {
//		Session currentsession=sessionFactory.getCurrentSession();
//		currentsession.update(marks);
//		
//	}
	
	

}
