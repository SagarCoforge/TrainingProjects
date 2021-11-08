package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class main {
	public static void main(String[] args) {
		
		Resource res = new ClassPathResource("bean.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		Message mes=(Message)factory.getBean("mybean");
		System.out.println(mes.getMessage());
	}

}
