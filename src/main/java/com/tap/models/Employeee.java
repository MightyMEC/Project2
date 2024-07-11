package com.tap.models;

public class Employeee {
private int id;
private String name;
private String email;
private String department;
private int salary;

public Employeee() {
	
}
public Employeee(int id,String name,String email,String department,int salary) {
	this.id=id;
	this.name=name;
	this.email=email;
	this.department=department;
	this.salary=salary;
	
}
public int getId() {
	return id;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}



}