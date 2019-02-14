package dom.jagadish.com.SpringAssignment8;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App  {
    public static void main( String[] args )
    {
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	Employee employee=(Employee)context.getBean("emp");
    	System.out.println(employee);
    	context.registerShutdownHook();
    }
}
