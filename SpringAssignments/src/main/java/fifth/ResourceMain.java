package fifth;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ResourceMain {

	public static void main(String[] args) {
		
		
		ApplicationContext obj= new ClassPathXmlApplicationContext("Resource1.xml");
		Resource1 emp= (Resource1) obj.getBean("employee");
		System.out.println(emp.toString());
	}

}
