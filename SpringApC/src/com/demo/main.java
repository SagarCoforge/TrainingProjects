package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
	public static void main(String[] args) {
	ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
	
	Message mes=(Message) context.getBean("bean");
	System.out.println( mes.getMessage()); 
	}
}
