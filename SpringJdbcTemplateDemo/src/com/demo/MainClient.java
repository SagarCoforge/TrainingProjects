package com.demo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClient {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		StudentJDBCImpl studentJDBCImpl = (StudentJDBCImpl)context.getBean("studentdao");
		
		System.out.println("recored creation..");
		studentJDBCImpl.createStudent("ram1","25");
		studentJDBCImpl.createStudent("tom","26");
		
		
	
		// for update
		
		Student student = new Student();
		
		student.setId(6);//update the details on the bases of id
		student.setStudname("tom little");
		student.setAge("30");
		
		studentJDBCImpl.updateStudentRecord(student);
		
		
		/// retrive the list of students from DB
		
		List<Student> listofstudents = studentJDBCImpl.listAllStudents();{
			
			for(Student stud:listofstudents) {
			
				String studentname=stud.getStudname();
				String age= stud.getAge();
				
				System.out.println(" student  name "+studentname+"student age "+age);
		
				
			}
			
		
			
		}
		
		System.out.println("done.......");
		
		

		

}
}