package com.tap.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.tap.models.Employeee;

public class EmployeeeBoImpl implements EmployeeeBo {
	public static Connection connection;
	public static PreparedStatement prepareStatement;
	public static Statement createStatement;
	public static ResultSet res;
	
	private final static String uq="UPDATE `employee` SET name=?,dept=?,salary=? WHERE id=?";
	private final static String query = "SELECT * from `employee`";
	private final static String dq = "DELETE from `employee` WHERE `id`=?";
	private final static String Insert_Query="INSERT into `employeee` (`uid`,`uname`,`uemail`,`udept`,`usalary`) values (?,?,?,?,?)";
	
	@Override
	public int save(Employeee e) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Passcode@123");
			prepareStatement = connection.prepareStatement(Insert_Query);
			
			prepareStatement.setInt(1,e.getId());
			prepareStatement.setString(2,e.getName());
			prepareStatement.setString(3,e.getEmail());
			prepareStatement.setString(4,e.getDepartment());
			prepareStatement.setInt(5,e.getSalary());
				
			return prepareStatement.executeUpdate();
			
			
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return 0;
		
		
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Employeee e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Employeee e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Employeee get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employeee> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


	

}
