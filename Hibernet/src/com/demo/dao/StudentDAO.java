package com.demo.dao;

import java.util.List;

import com.demo.pojo.Student;



public interface StudentDAO {
	
	
	// insert records for student
	public Student createStudent(Student student);
	
	public Student updateStudent(Student student);
	
	//public List<Student> getStudent() ;
	
	public Student deleteStudent(Integer Id);
	public Student getStudent(Integer Id);




}