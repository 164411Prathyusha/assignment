package Assignment;

import java.util.Scanner;

public class Incometax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int slab_a,slab_b,slab_c,slab_d,tax;
		Scanner sl =new Scanner (System.in);
	    System.out.println("Enter the value:");
	    tax=sl.nextInt();
	    
	    if(tax>0&&tax<180000)
	    {
	    	System.out.println("Tax payable nil");
	    }
	    else if(tax>181001&&tax<300000){
	    	tax*=0.1;
	    	System.out.println("Tax payable is 10%:"+ tax);
	    }
	    else if(tax>300001&&tax<500000){
	    	tax*=0.2;
	    	System.out.println("Tax payable is 20%:"+ tax);
	    }
	    else
	    	tax*=0.3;
	    System.out.println("Tax payable is 30%:"+ tax);
	}

}
