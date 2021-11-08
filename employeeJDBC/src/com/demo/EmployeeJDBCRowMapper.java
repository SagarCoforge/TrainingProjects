package com.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeJDBCRowMapper implements RowMapper{
	 // this resultSEt is coming from db row mapping alread given in jdbc topics in core java	
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			

			Employee emp = new Employee();
			// mapping results in colums
			emp.setEid(rs.getInt("eid"));
			emp.setEname(rs.getString("ename"));
			
			return null;
		}
			

}
