package org.madbit.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.madbit.hibernate.entity.Person;

public class MyDAO {
	
	private static SessionFactory sessionFactory;	
	
	public static void setSessionFactory(SessionFactory sessionFactory) {
		MyDAO.sessionFactory = sessionFactory;
	}

	public void addPerson(Person p) {
		Session session = sessionFactory.openSession();
		session.save(p);
		session.close();		
	}
}
