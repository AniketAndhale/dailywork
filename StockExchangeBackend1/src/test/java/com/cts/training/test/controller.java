package com.cts.training.test;

import com.cts.training.bean.User;
import com.cts.training.dao.UserDAO;
import com.cts.training.daoimpl.UserDAOImpl;

public class controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserDAO userDAO=new UserDAOImpl();
		
		User user=new User(101, "Anvi", "love", true, "hello@123", 12345, false, 0);
		userDAO.saveUser(user);

	}

}
