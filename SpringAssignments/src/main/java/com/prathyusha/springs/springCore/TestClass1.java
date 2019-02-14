package com.prathyusha.springs.springCore;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("textClass1.xml");
		CustomerClass1 obj= (CustomerClass1)context.getBean("CustomerClass1");
		System.out.println(obj.toString());
		
	/*	Demo demo=(Demo) context.getBean("bean");
		System.out.println(demo.getName("demo"));*/
		
	}
}