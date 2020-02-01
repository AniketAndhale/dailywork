package com.cts.training.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.training.model.Compny;
import com.cts.training.model.StockExchange;


public class CompnyController {
public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
//	Compny compny= new Compny(101,"digital","Brain", "ggg", 455512);
		StockExchange se = new StockExchange(2,"KSE","PUNE","like");
		
				
session.save(se);
transaction.commit();
session.close();

}



}
