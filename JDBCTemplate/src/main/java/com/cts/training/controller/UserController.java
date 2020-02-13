package com.cts.training.controller;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.training.dao.UserDAO;
import com.cts.training.jdbcdemo.User;

public class UserController {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext( "./bean.xml");
		UserDAO userdao = (UserDAO)context.getBean ("userdaoimpl");
//		User user = new User(3,"sai","sd@as","wedf");
//		System.out.println(userdao.saveUser(user));
		
		System.out.println(userdao.getUserById(1));
		
	}

}
