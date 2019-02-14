package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Person {
@Id
  String id;
  String firstName;
   String lastname;
    int age;
public Person(String firstName, String lastname, int age) {
	super();
	this.firstName = firstName;
	this.lastname = lastname;
	this.age = age;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Person [id=" + id + ", firstName=" + firstName + ", lastname=" + lastname + ", age=" + age + "]";
}
 

}
