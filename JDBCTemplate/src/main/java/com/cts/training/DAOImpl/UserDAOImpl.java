package com.cts.training.DAOImpl;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.RowMapper;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.cts.training.dao.UserDAO;
import com.cts.training.jdbcdemo.User;

public class UserDAOImpl implements UserDAO {
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
		}
	public boolean saveUser(User user) {
		String query = "insert into userdao values(?,?,?,?)";
		try {
			jdbcTemplate.update(
					query, user.getId(),
					user.getName(),
					user.getEmail(),
					user.getPassword());
			return true;
		   }
		catch (DataAccessException e) {
			e.printStackTrace();
			return false;   }
		}
	public boolean updateUser() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public User getUserById(int id) 
	{   String query = "select * from userdao where id = ?";  
	BeanPropertyRowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);  
	return jdbcTemplate.queryForObject(query, rowMapper, id);  }
	

	public List<User> getAllUser() { 
		return jdbcTemplate.query("select * from employee", new ResultSetExtractor<List<User>>() {
		public List<User> extractData(ResultSet rs) throws SQLException, DataAccessException { 
		 List<User> list = new ArrayList<User>(); 
		 while (rs.next()) 
		 {  
			 User user = new User();   
		 user.setId(rs.getInt(1));  
		 user.setName(rs.getString(2));  
		 user.setPassword(rs.getString(3)); 
		 user.setEmail(rs.getString(4));  
		 
		 list.add(user); 
		 } 
		 return list;
		 }
	
}); 
		} 
}

