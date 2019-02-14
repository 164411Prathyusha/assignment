package com.capg.collections;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Person1 {

public static void main(String[] args) {
	display();
}
	  public static void display(){
		     TreeSet<Person> treeSet = new TreeSet<Person>(new Person());
		     treeSet.add(new Person("Ram",35,4));
		     treeSet.add(new Person("John",60,5.1));
		     treeSet.add(new Person("Crish",25,3));
		     treeSet.add(new Person("Tom",25,3.1));
		     Iterator<Person> iterator=treeSet.iterator();
		     while(iterator.hasNext()){
		    	 Person person=iterator.next();
		    	 System.out.println(person.toString());
		    	 System.out.println("A".equals(null));
		     }
		     
		    
		 }
}
