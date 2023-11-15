package com.hibernate.xml.CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.xml.Entity.Song;

public class Readapp {
public static void main(String[] args) {
//	Configuration configuration=new Configuration();
//	configuration.configure("hibernate.cfg.xml");
//	configuration.addAnnotatedClass(Song.class);
//	SessionFactory sessionFactory=configuration.buildSessionFactory();
//	Session session=sessionFactory.openSession();
	
	
	SessionFactory sessionFactory = getSessionFactory();
	Session session=sessionFactory.openSession();
   //Song song=session.get(Song.class,2);
	//get method and load method is used to fetch data from database
	Song song=session.load(Song.class,3);
	System.out.println(song);
	
}
private static SessionFactory getSessionFactory() {
	Configuration configuration=new Configuration();
	configuration.configure("hibernate.cfg.xml");	
	configuration.addAnnotatedClass(Song.class);
	SessionFactory sessionFactory=configuration.buildSessionFactory();
	return sessionFactory;
}
}
