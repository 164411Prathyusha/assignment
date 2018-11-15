package Numb;

import java.util.Scanner;

public class Ascdesc {
	int arr[] = new int[10];
	 public void get(){
		 System.out.println("Enter num");
		 Scanner input=new Scanner(System.in);
		 for (int i = 0; i < arr.length; i++){
			 arr[i] = input.nextInt();
		    }
		 asc();
		 }
	 public void asc(){
		 int i=0;
		 System.out.println("ascending order");
	 }
}
