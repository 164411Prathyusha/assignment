package Assignment;

import java.util.Scanner;

public class Arraysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[]{5,12,14,6,78,19,1,23,16,35,37,7,52,86,47};
		int i;
		
		System.out.println("Enter the number:  ");
		Scanner scanner=new Scanner(System.in);
		int key= scanner.nextInt();
		for(i=0;i<15;i++)
		{
			if(arr[i]==key) {
				System.out.println("The element is found");
				break;
			}
		}
		if(i==15)
			System.out.println("Not found");

	}

}
