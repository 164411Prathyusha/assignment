package Assignment;

import java.util.Scanner;

public class SupplyMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double mark1,mark2,mark3;
		Scanner cd1 =new Scanner (System.in);
	    System.out.println("Enter the value:");
	   mark1=cd1.nextDouble();
	    System.out.println("Enter the value:");
	    mark2=cd1.nextDouble();
	    System.out.println("Enter the value:");
	    mark3=cd1.nextDouble();
	    if(mark1>60&&mark2>60&&mark3>60) {
	    	System.out.println("Pass");
	    }
	    else if((mark1>60&&mark2>60)||(mark2>60&&mark3>60)||(mark1>60&&mark3>60)){
	    	System.out.println("promoted");
	    }
	    System.out.println("Fail");

	}

}
