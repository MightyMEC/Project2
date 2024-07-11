package com.tap.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tap.dao.EmployeeeBoImpl;
import com.tap.models.Employeee;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int id = Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String department=request.getParameter("department");
		int salary = Integer.parseInt(request.getParameter("salary"));
		
		Employeee e = new Employeee(id,name,email,department,salary);
		EmployeeeBoImpl employeeeBoimp = new EmployeeeBoImpl();
		employeeeBoimp.save(e);
		response.sendRedirect("success.html");		
	}

}
