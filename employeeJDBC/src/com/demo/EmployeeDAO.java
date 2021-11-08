package com.demo;

import java.util.List;

import javax.sql.DataSource;

public interface EmployeeDAO {
	
	// looking for data soruce like mysql db
	public void setDataSoruce(DataSource ds);
	
	// insert records for student
	public void createEmployee(String name);
	
	// update records for student
	public void updateEmployeeRecord(Employee employee);
	
	// delete records for student
	public void deleteEmployeeById();
	
	// view records for pertucular student
	public Employee viewEmployeeRecodById(Integer id);
	
	// view all records for students
	public List<Employee> listAllEmployee();

}