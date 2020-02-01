package com.cts.training.controller;

public class UserController {
	Configuration cfg = new Configuration();
	cfg.configuration();
	
	
	SessionFactory sessionFactory cfg.buildSessionFactory();
	Session session = sessionFactory.openSession();
	
	Transaction transaction = session.neginTransaction();
	user u = new user(101,"user","user@123","user@cts.com",21558741555L,false);
	session.save(user);
	transaction.commit();
	session.close();
	
}
