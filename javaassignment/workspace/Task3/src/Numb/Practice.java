package Numb;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num[]= new int[];
		int i;
		int num[]=new int[10];
		Scanner sc=new Scanner(System.in);
		for(i=0;i<num.length;i++){
			System.out.println("enter value");
			num[i]=sc.nextInt();
		}
		for(i=0;i<10;i++){
		System.out.println(num[i]);
		}
	}

}
