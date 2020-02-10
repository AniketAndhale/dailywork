package com.cts.training.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.training.model.UserEntity;

public class UserAnnotationController {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		context.scan("com.cts.training");
		context.refresh();
		UserEntity userEntity = (UserEntity)context.getBean("userEntity");
		
		List<String> email = new ArrayList<String>(Arrays.asList("anike@as","asd@asd","asd@dd"));
		
		userEntity.setEmail(email);
		System.out.println(userEntity.getEmail());
	}

}
