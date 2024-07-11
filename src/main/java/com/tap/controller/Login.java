package com.tap.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String fetch="SELECT * from `employeee` where uname=? and uemail=?";
	private Connection connection;
	private PreparedStatement prepareStatement;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		PrintWriter writer = response.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Passcode@123");
			
			prepareStatement = connection.prepareStatement(fetch);
			prepareStatement.setString(1, name);
			prepareStatement.setString(2, email);
			 ResultSet res = prepareStatement.executeQuery();
			
			
			 System.out.println("outside--" +res);
			if(res.next()==true) {
				System.out.println("inside--" +res);
				//writer.print("<h1>welcome  "+res.getString(2)+"</h1>");
				response.sendRedirect("successful.html");
			}
			else {
				writer.print("<h1>invalid user id and password</h1>");
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
