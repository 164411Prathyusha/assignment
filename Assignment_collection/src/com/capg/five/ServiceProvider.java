package com.capg.five;

import java.util.Hashtable;

public class ServiceProvider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Employee, Integer> hashtable=new Hashtable<Employee, Integer>();
		System.out.println(hashtable.put(new Employee("Prathyusha", 5500), 1));
		System.out.println(hashtable.put(new Employee("Neelima", 6000), 2));
		System.out.println(hashtable.get(new Employee("Prince Mahesh", 5000)));
	}
}
