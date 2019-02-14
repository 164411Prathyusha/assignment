package com.capg.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList1 {
	
    ArrayList<String>arraylist;
    public void add(){
    	arraylist=new ArrayList<String>();
    	arraylist.add("Peacock");
    	arraylist.add("Parrot");
    	arraylist.add("Duck");
    	arraylist.add("Eagle");
    	
    }
    public void display(){
    	ListIterator<String> listIterator=arraylist.listIterator();
    	System.out.println("Forward list:");
    	System.out.println("--------------");
    	while(listIterator.hasNext()){
			System.out.println(listIterator.next());			
		}	
    	System.out.println("Backward Direction:");
    	System.out.println("--------------------");
		while(listIterator.hasPrevious()){
			System.out.println(listIterator.previous());			
		}
    }
    public static void main(String[] args) {
		ArrayList1 arr=new ArrayList1();
		arr.add();
		arr.display();
	}
}
