package com.cts.training.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.training.model.Account;

import com.cts.training.model.Customer;




public class CustomerController {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Customer entity = (Customer)context.getBean("user");
		System.out.print(entity);
		Account ac=entity.getAccount();
		System.out.println(ac.getAcno());
	}

}
