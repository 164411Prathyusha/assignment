package One;

import java.util.ArrayList;
import java.util.List;

public class First {
    
		public static void main(String[] args) {
			
			List<Fruits> aList = new ArrayList<Fruits>(); 
	        aList.add(new Fruits("appe",150,250,"GreenRed")); 
	        aList.add(new Fruits("orange",120,150,"orange")); 
	        aList.add(new Fruits("Grape",80,120,"Green")); 
	        aList.add(new Fruits("Mango",110,70,"Yellow"));
	        aList.stream() 
	        .filter(s->s.getCalories()<100)
	       
	        .forEach(System.out::println); 
	        
		}
			
			  
			
			
		
}
