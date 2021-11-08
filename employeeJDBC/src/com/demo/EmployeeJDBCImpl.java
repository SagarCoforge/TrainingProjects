package com.demo;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeJDBCImpl implements EmployeeDAO{
	private DataSource dataSourceprop;
	private JdbcTemplate JdbcTemplateoobject;
	@Override
	public void setDataSoruce(DataSource ds) {
		this.dataSourceprop=ds;
		this.JdbcTemplateoobject = new JdbcTemplate(dataSourceprop);

		
	}
	@Override
	public void createEmployee(String ename) {
		String sql="insert  into new_table(ename) values(?)";
		JdbcTemplateoobject.update(sql,ename);
		
		return;
		
	}
	@Override
	public void updateEmployeeRecord(Employee employee) {
		String udpdateemployeerecord="UPDATE new_table SET ename = ? where eid= ?"; 
		JdbcTemplateoobject.update(udpdateemployeerecord, new Object[] {
			employee.getEname(), Integer.valueOf(employee.getEid())
		});
	}
	@Override
	public void deleteEmployeeById() {
		String deleteEmployeebyid="DELETE FROM new_table WHERE eid='1'";
				JdbcTemplateoobject.update(deleteEmployeebyid);
		
	}
	@Override
	public Employee viewEmployeeRecodById(Integer id) {
				return null;
	}
	@Override
	public List<Employee> listAllEmployee() {
 List<Employee> employeelist = new ArrayList<Employee>();
		 
		 String employeelistsql="select * from emp.new_table";
		// any of else can be used
			//	 studentlist = JdbcTemplateoobject.query(studentlistsql,new StudentJbdcRowMapper(Student.class));
				 
				 employeelist = JdbcTemplateoobject.query(employeelistsql,new BeanPropertyRowMapper(Employee.class));
				 
			
				return employeelist;
		 
		
	}

}
