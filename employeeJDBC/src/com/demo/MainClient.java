package com.demo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClient {
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeJDBCImpl employeeJDBCImpl = (EmployeeJDBCImpl)context.getBean("empdao");
		
		System.out.println("recored creation..");
		employeeJDBCImpl.createEmployee("ash");
		employeeJDBCImpl.createEmployee("sag");
		System.out.println("recored creation. done.");
		
		// for update
		System.out.println("recored updation..");
				Employee employee= new Employee();
				
				employee.setEid(3);//update the details on the bases of id
				employee.setEname("sagar");
				employeeJDBCImpl.updateEmployeeRecord(employee);
				System.out.println("recored updation..done ");
				
				
				///to delete record
				//Employee del=new Employee();
			//	del.setEid(1);
				employeeJDBCImpl.deleteEmployeeById();
				
				
				
				/// retrive the list of students from DB
				System.out.println("recored retrival..");
				List<Employee> listofemployee = employeeJDBCImpl.listAllEmployee();{
					
					for(Employee emp:listofemployee) {
					
						String employeename=emp.getEname();
						int id= emp.getEid();
						
						System.out.println(" employee name "+employeename+"emp id "+id);
				
						
					}
					
				
					
				}
		
		System.out.println("done.......");

		

}
}