package com.demo;

import java.util.List;

import javax.sql.DataSource;

public interface StudentDAO {
	
	// looking for data soruce like mysql db
	public void setDataSoruce(DataSource ds);
	
	// insert records for student
	public void createStudent(String name,String age);
	
	// update records for student
	public void updateStudentRecord(Student student); 
	
	// delete records for student
	public void deleteStudentById(Integer id);
	
	// view records for pertucular student
	public Student viewStudentRecodById(Integer id);
	
	// view all records for students
	public List<Student> listAllStudents();

}