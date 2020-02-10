package com.cts.training.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.cts.training.model.AddressEntity;
import com.cts.training.model.UserEntity;

public class UserController {
	public static void main(String[] args) {
//		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("bean.xml"));
		//UserEntity entity = (UserEntity)beanFactory.getBean("user");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("namespace.xml");
		
		UserEntity entity = (UserEntity)context.getBean("user");
		
		System.out.println(entity);
		
		//AddressEntity address=entity.getAddress();
		AddressEntity eng = (AddressEntity)context.getBean("address");
		System.out.println(eng.getCity());
	}

}
