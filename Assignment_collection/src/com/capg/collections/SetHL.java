package com.capg.collections;

import java.awt.DisplayMode;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;



public class SetHL {
	
	 HashSet<Integer>dSet;
	LinkedHashSet<Integer>dSet1;
	
	
   public  void  add(){
	  dSet=new HashSet<Integer>();
	  dSet.add(40);
	  dSet.add(30);
	  dSet.add(70);
	  dSet.add(100);

	 dSet1= new LinkedHashSet<Integer>();
	  dSet1.add(40);
	  dSet1.add(30);
	  dSet1.add(70);
	  dSet1.add(100);
	
	   }
   public  void display(){
	
	   System.out.println("Unordered list");
	   Iterator<Integer> iterator = dSet.iterator();
	   while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	   System.out.println("\n Ordered list");
	   Iterator<Integer> iterator1 = dSet1.iterator();
	   while (iterator1.hasNext()) {
		System.out.print(iterator1.next() + " ");
		}
   }
   public static void main(String[] args) {
		SetHL p1=new SetHL();
		p1.add();
		p1.display();
	}
      }

