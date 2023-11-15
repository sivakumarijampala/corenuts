package com.hibernate.xml.CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.xml.Entity.Song;

public class DeleteApp {
public static void main(String[] args) {
//	Configuration configuration=new Configuration();
//	configuration.configure("hibernate.cfg.xml");
//	configuration.addAnnotatedClass(Song.class);
//	SessionFactory sessionFactory=configuration.buildSessionFactory();
//Session session=sessionFactory.openSession();
	
	
	SessionFactory sessionFactory = getSessionFactory();
	Session session=sessionFactory.openSession();
	
	
	//load the object that i want to delete
	Song song=session.get(Song.class,1);
	
	session.beginTransaction();
	//deleting the object that i have just loaded...
	session.delete(song);
	session.getTransaction().commit();
}

private static SessionFactory getSessionFactory() {
	Configuration configuration=new Configuration();
	configuration.configure("hibernate.cfg.xml");	
	configuration.addAnnotatedClass(Song.class);
	SessionFactory sessionFactory=configuration.buildSessionFactory();
	return sessionFactory;
}
}
