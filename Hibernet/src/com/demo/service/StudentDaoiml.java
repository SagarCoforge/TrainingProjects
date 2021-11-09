package com.demo.service;

import java.util.List;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.dao.StudentDAO;
import com.demo.pojo.Student;
import com.demo.util.HibernetUtil;


public class StudentDaoiml implements StudentDAO {

	static SessionFactory sessionFactoryObj;
	static Session sessionObj;

	@Override
	public Student createStudent(Student student) {

		Transaction tx = null;
		
		
		try {
		// enbble the session by calling opensesion method
		sessionObj = HibernetUtil.buildSessionFactory().openSession();
		tx = sessionObj.beginTransaction();

		sessionObj.save(student);// insert into table and formed the sql query automaticall "insert into student values(?,?)
		tx.commit();
	
		}catch(Exception e) {
			
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		}
		 finally {
				sessionObj.close();
			}
		
		return student;

	}

	@Override
	public Student updateStudent(Student student) {
		Transaction tx= null;
		//
		
		try {
			// enbble the session by calling opensesion method
			sessionObj=HibernetUtil.buildSessionFactory().openSession();
			tx=sessionObj.beginTransaction();
			
			// get student obj
			//student= (Student) sessionObj.get(Student.class, Id);
			
			sessionObj.saveOrUpdate(student);
			tx.commit();
		}catch(Exception e) {
			
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		}
		 finally {
				sessionObj.close();
			}
		
		return student;
		
	}
	
// --------------------------to get the student details
	/*@SuppressWarnings("unchecked")
	@Override
	public List<Student> getStudent() {
		Transaction tx= null;
		List<Student> student=null;
		
		try {
			// enbble the session by calling opensesion method
			sessionObj=HibernetUtil.buildSessionFactory().openSession();
			tx=sessionObj.beginTransaction();
			
			// get student obj using hibernate query lang
			student= (List<Student>) sessionObj.createQuery("from studenthiber").list();
			
			sessionObj.saveOrUpdate(student);
			tx.commit();
		}catch(Exception e) {
			
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		}
		 finally {
				sessionObj.close();
			}
		
		return student;
	}*/
	

//-------------------- to delete the student record
	@Override
	public Student deleteStudent(Integer Id) {
		Transaction tx= null;
		Student student=null;
		
		try {
			// enbble the session by calling opensesion method
			sessionObj=HibernetUtil.buildSessionFactory().openSession();
			tx=sessionObj.beginTransaction();
			
			
			student=(Student) sessionObj.get(Student.class, Id);
			sessionObj.delete(student);
			tx.commit();
		}catch(Exception e) {
			
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		}
		 finally {
				sessionObj.close();
			}
		return student;
		
	
		
	}
	
	//------------to get the details
	@Override
	public Student getStudent(Integer Id) {
		Transaction tx= null;
		Student student=null;
		//
		
		try {
			// enbble the session by calling opensesion method
			sessionObj=HibernetUtil.buildSessionFactory().openSession();
			tx=sessionObj.beginTransaction();
			
			// get student obj
			student= (Student) sessionObj.load(Student.class, Id);
			
			//sessionObj.saveOrUpdate(student);
			tx.commit();
		}catch(Exception e) {
			
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		}
		 finally {
				sessionObj.close();
			}
		
		return student;
		
	}


}