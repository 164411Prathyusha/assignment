package Assignment;

import java.util.Scanner;

public class Studentmark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		    for(int i=0;i<3;i++){
		    	
		    	System.out.println("This is for student "+(i+1));
		    	System.out.println("Enter marks in subject A ");
			    int markA = sc.nextInt(); 
			   
			    System.out.println("Enter marks in subject B ");
			    int markB = sc.nextInt(); 
			   
			    
			    System.out.println("Enter marks in subject C ");
			    int markC = sc.nextInt(); 
			    
			    int TotalScore=(markA+markB+markC);
				float AvgScore= (TotalScore/3);
				System.out.println("The total score is "+TotalScore);
				System.out.println("The average score is "+AvgScore);
		    }
		    

	}

}
