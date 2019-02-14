package com.capg.collections;

import java.util.Comparator;

public class Person implements Comparator<Person>{
       String name;
       double weight;
       double height;
       public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String name, double weight, double height) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", weight=" + weight + ", height="
				+ height + "]";
	}
	@Override
	public int compare(Person arg0, Person arg1) {
		if(arg0.weight==arg1.weight){
			if(arg0.height>arg1.height){
				return 1;
			}
			return -1;
		}
		else if(arg0.weight>arg1.weight){
			return 1;
		}
		return -1;
	
	}
       
}
