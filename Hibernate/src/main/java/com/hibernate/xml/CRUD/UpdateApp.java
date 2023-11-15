
package com.hibernate.xml.CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.xml.Entity.Song;

public class UpdateApp {
	public static void main(String[] args) {
//		Configuration configuration=new Configuration();
//		configuration.configure("hibernate.cfg.xml");
//		configuration.addAnnotatedClass(Song.class);
//`	
//		SessionFactory sessionFactory=configuration.buildSessionFactory();
//		Session session=sessionFactory.openSession();
		
		
//		//id-1 song changed to tuje dekha thoye
//		Song song=new Song();
//		song.setId(1);
//		song.setSongName("tuje dekha thoye");
		
		
		SessionFactory sessionFactory = getSessionFactory();
		Session session=sessionFactory.openSession();
		
		Song song=session.get(Song.class,3);
		song.setSongName("chekkini chemeli");
		
		session.beginTransaction();
		session.update(song);
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
