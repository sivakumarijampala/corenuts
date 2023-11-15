package com.hibernate.xml.CRUD;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.hibernate.xml.Entity.Song;

public class InsertApp {
	public static void main(String[] args) {
		//if we want to create a session object we need to create session factory 
		//which is factory design pattern is used to give session object
		//create session factory 
		
			//data source means how we will connect to database
			//to create data source inside hybernet we need session factory
		//to create session factory we need configuration


		//create configuration 
		Configuration configuration=new Configuration();
		
		//this is a class used to configure a datasource 
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Song.class);

		//create session factory
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
           //initialize session object
		
           //Session session=null;//it gives  you a save method to save objects into database
	    Session session=sessionFactory.openSession();
	  //open session method is used to get session object
	    
       Song song=new Song();
       song.setId(5);
       song.setSongName("teri mitti");
       song.setArtist("aa");
       
      session.beginTransaction();// without transaction the hybernet cannot process
      session.save(song);
      session.getTransaction().commit();
      System.out.println("song saved ....check db");
}
}
