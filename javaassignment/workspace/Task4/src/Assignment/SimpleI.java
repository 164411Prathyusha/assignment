package Assignment;

import java.util.Scanner;

public class SimpleI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pro,tim,rat,si;
		double ci;
		Scanner ab=new Scanner (System.in);
	    System.out.println("Enter the amount:");
	   pro= ab.nextInt();
	   System. out. println("Enter the No.of years:");
	    tim=ab.nextInt();
	    System. out. println("Enter the Rate of  interest");
	    rat=ab.nextInt();
	    si=(pro * tim * rat)/100;
	    ci=pro * Math.pow(1.0+(rat/100.0),tim) - pro;
	    System.out.println("Simple Interest="+si);
	    System.out. println("Compound Interest="+ci);
	}

}
