package com.cts.arichpro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Table
{
	public static void main(String[] args) throws ClassNotFoundException,SQLException  {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/cts";
		String username="root";
		String password="anvi@1997";
		Connection conn =DriverManager.getConnection(url,username,password);
		System.out.println("connection establish");
		
		Statement stmt=conn.createStatement();
		//String query="insert into student5 values(2,'sayed',4500)";
		String query ="delete from  student5  where id =2";
		int result =stmt.executeUpdate(query);
		if(result>0) {
			System.out.println("creted");
		}
		else {
			System.out.println("not");
		}
	
		//ResultSet rs=stmt.executeQuery(query);
		//while(rs.next)
		//{
			
		//}
		
	}
	
}
