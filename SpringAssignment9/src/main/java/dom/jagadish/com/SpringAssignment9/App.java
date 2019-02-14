package dom.jagadish.com.SpringAssignment9;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
	
public static void main( String[] args )
	
{


		
AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
context.registerShutdownHook();
		
Employee emp = (Employee) context.getBean("employee");
		System.out.println(emp);
	
	emp.getName();
		

	}


}
