package com.tap.dao;

import java.util.List;

import com.tap.models.Employeee;

public interface EmployeeeBo {
	int save(Employeee e);
	int delete(int id);
	int delete(Employeee e);
	int update(Employeee e);
	Employeee get(int id);
	List<Employeee> getAll();

}
