package com.sample.list;

public class CheckList {
public static void main(String[] args) {
	MyArrayList myArrayList=new MyArrayList();

	System.out.println(myArrayList.add(10));
	System.out.println(myArrayList.add(20));
	System.out.println(myArrayList.add(30));
	System.out.println(myArrayList.add(40));
	System.out.println(myArrayList.add(50));
	System.out.println("get method:"+ myArrayList.get(2));
	System.out.println("get All method:"+myArrayList.getAll());
	System.out.println("Get update method:"+myArrayList.update(2, 60));
	System.out.println("Remove method:"+myArrayList.remove(1));
}
}