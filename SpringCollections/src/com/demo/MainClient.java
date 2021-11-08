package com.demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClient {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("bean.xml");
		
		
		JavaCollections collec1= (JavaCollections)con.getBean("collectiondemo");
		
		
		System.out.println(collec1.getAddressList());
		
		
		
		//same for other colections
    //for your implementations

	}

}
