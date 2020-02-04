package com.cts.training.controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.catalina.servlet4preview.RequestDispatcher;
@WebServlet("/create")
public class Loginservlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse responce) {
		Connection conn;
		String url = "jdbc:mysql://localhost:3306/cts";
		String username = "root";
		String password = "anvi@1997";
		String query = "insert into user values(?,?,?,?,?,?)";
		int id = Integer.parseInt(request.getParameter("id"));
		String usernam = request.getParameter("user");
		String passwor = request.getParameter("pass");
		String rpassword = request.getParameter("rpass");
		String email = request.getParameter("email");
		long mobile = Long.parseLong(request.getParameter("mobile"));
		PreparedStatement ps;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, username, password);
			ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			ps.setString(2, usernam);
			ps.setString(3, passwor);
			ps.setString(4, rpassword);
			ps.setString(5, email);
			ps.setLong(6, mobile);
			
			
			int result = ps.executeUpdate();
			System.out.println(result);
	
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}










