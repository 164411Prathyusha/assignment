package com.prathyusha.springs.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("textClass1.xml");
		CustomerClass1 obj= context.getBean(CustomerClass1.class);
		System.out.println(obj.toString());

	}

}
