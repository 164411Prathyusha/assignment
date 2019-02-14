package com.prathyusha.springs.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("question2.xml");
	Question2 obj= (Question2) context.getBean("Hello");
		System.out.println(obj.toString());
	}

}
