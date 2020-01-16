package com.cts.activity.main;

import com.cts.activity.dao.EmployDAO;

public class EmployMain {
	public static void main(String[] args) {
		EmployDAO employdao =new EmployDAOImpl();
		Employ emp =employdao.getEmployById(1);
		System.out.println(emp);
	}

}
