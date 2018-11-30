import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Four {
                public static void main(String[] args) {
                	 ArrayList<String> students = new ArrayList<String>(); 
					   
				      
				        students.add("Ram"); 
				        students.add("Bunny"); 
				        students.add("Mahesh"); 
				        students.add("Rabi"); 
				        students.add("Bharath"); 
                	
                    students.removeIf( nam -> (nam.length()%2!=0));
                    
                    for (String str : students) { 
			            System.out.println(str); 
			        } 
                   
				} 
				
		
}