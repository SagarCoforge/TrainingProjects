package com.demo;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCImpl  implements StudentDAO{
	
	private DataSource dataSourceprop;
	private JdbcTemplate JdbcTemplateoobject;


	public void setDataSoruce(DataSource ds) {
		
		this.dataSourceprop=ds;
		this.JdbcTemplateoobject = new JdbcTemplate(dataSourceprop);

	
		
	}

	//user deifined method and you have to write logic
	public void createStudent(String studname, String age) {
		
		String sql="insert  into student(studname,age) values(?,?)";
		
		JdbcTemplateoobject.update(sql,studname,age);
		
    	return;

		
	}

	 /// api for update
	
		@Override
		public void updateStudentRecord(Student student) {
		String udpdatestudedntrecord="UPDATE student SET studname = ?, age= ?  where id= ?"; 
			JdbcTemplateoobject.update(udpdatestudedntrecord, new Object[] {
				student.getStudname(),student.getAge() , Integer.valueOf(student.getId())
			});
		}
	@Override
	public void deleteStudentById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student viewStudentRecodById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> listAllStudents() {
		
		 List<Student> studentlist = new ArrayList<Student>();
		 
		 String studentlistsql="select * from student";
		 
		  // any of else can be used
	//	 studentlist = JdbcTemplateoobject.query(studentlistsql,new StudentJbdcRowMapper(Student.class));
		 
		 studentlist = JdbcTemplateoobject.query(studentlistsql,new BeanPropertyRowMapper(Student.class));
		 
	
		return studentlist;
	}
	




}