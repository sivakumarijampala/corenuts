package com.feuji.student_management.repo;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.feuji.student_management.model.Student;
import com.feuji.student_management.model.StudentAlias;

@Transactional
@Repository
@Component
public class StudentDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveStudent(Student student) {
		Session currentsession=sessionFactory.getCurrentSession();
		currentsession.saveOrUpdate(student);
	
	}
	
	
	
	public List<Student> get(){
		Session currentsession=sessionFactory.getCurrentSession();
		CriteriaBuilder builder=currentsession.getCriteriaBuilder();
		CriteriaQuery<Student> criteria=builder.createQuery(Student.class);
		criteria.from(Student.class);
		List<Student> students=currentsession.createQuery(criteria).getResultList();
		return students;	
	}
	
	
	public Student getStuById(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession.load(Student.class,id);
	}
	
	public void delete(int s) {
		Session currentsession=sessionFactory.getCurrentSession();
		Student stu=currentsession.get(Student.class,s);
		currentsession.delete(stu);
	
	}



	public StudentAlias get(int id) {
		Session currentsession=sessionFactory.getCurrentSession();
		return currentsession.get(StudentAlias.class, id);
		
	}
	
//	public void update(int stud) {
//		Session currentsession=sessionFactory.getCurrentSession();
//		Student stude=currentsession.get(Student.class,stud);
//		currentsession.update(stude);
//		
//	}



	
	

}
