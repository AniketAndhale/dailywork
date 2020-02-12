package com.cts.training.dao.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.training.bean.User;
import com.cts.training.dao.UserDAO;



public class UserUnitTest {
	
	private static AnnotationConfigApplicationContext context;
	private static  UserDAO userDAO;
	private static User user;
	@BeforeClass
	public static void init()
	{ 
		context = new AnnotationConfigApplicationContext();
		context.scan("com.cts.training");
		context.refresh();
		user=(User) context.getBean("user");
		userDAO = (UserDAO) context.getBean("userDAO"); 
		
		
	}
	@Test
	@Ignore
	public void testGetAllUser() {
		
		List<User> users = userDAO.getAllUsers();
		assertEquals(2, users.size()); 
	
	
	}
	@Ignore
	@Test
	public void test_update_user_success()
	{
		User user = userDAO.getUserById(1);
		user.setConfirmed(false);
		assertEquals(true, userDAO.updateUser(user));
	}
	
	
	@Test
	
	public void test_add_User()
	{
		User user=new User(1, "anikwt", "anjh", true, "ani@123", 1555652, true, 85);
		assertEquals(true, userDAO.saveUser(user));
	}
	
	@Test
	@Ignore
	
	public void test_remove()
	{
		User user=userDAO.getUserById(1);
		assertEquals(true, userDAO.removeUser(user));
	}
	
	@Test
	@Ignore
	public void get_valid_user() {
		assertEquals(true,userDAO.isValidUser("aniket", "syed") );
	}
	


}
