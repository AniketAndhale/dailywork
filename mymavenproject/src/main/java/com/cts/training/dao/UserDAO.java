package com.cts.training.dao;

import java.util.List;

import com.cts.training.model.User;



public interface UserDAO {
	public boolean saveOrUpdate(User user);
	
	public boolean delete(User user );
	
	public User getUserById(int id);
	
	public List<User>  getAllUser();
	

	
}
