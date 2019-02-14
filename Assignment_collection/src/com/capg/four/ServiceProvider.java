package com.capg.four;

public class ServiceProvider {
public static void main(String[] args) {
		
		MyDate myDate=new MyDate();
	
		myDate.add(new DateClass(16,11,2002), "Prathyusha");
		myDate.add(new DateClass(15,11,2005), "mallika");
	     myDate.add(new DateClass(15,11,2006), "Poojitha");
		
		System.out.println(myDate.get(new DateClass(15,11,2006)));
		System.out.println(myDate.get(new DateClass(16,11,2002)));
	}
}
