package com.cts.training.dao;

import com.cts.training.jdbcdemo.User;

public interface UserDAO {

	public boolean saveUser( User user);
	public User getUserById(int id) ;
	
   // public boolean updateUser();
    
//	public boolean deleteUser();
	
	
}
