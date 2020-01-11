package com.cts.activity.main;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

public class Database {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/cts";
		String username="root";
		String password="anvi@1997";
		Connection conn =DriverManager.getConnection(url,username,password);

		//create a statement
		Statement stmt=conn.createStatement();
		//String query ="insert into sai values(105,'nagasri',45000)";
		//String query ="update  sai set name='saikrishna' where id =102";
		//String query ="alter table  sai change name='saikrishna' where id =102";
	
		//System.out.println("connection establish");
		String query ="delete from table  sai  where id =102";
		
		String query ="select * from sai";
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getLong(3));
		}
	}
	
	
}
