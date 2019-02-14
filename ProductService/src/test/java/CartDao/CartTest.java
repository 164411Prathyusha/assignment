package CartDao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CartTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("web.xml");

		CartDAO dao = ctx.getBean(CartDAO.class);
		long status = dao.add(new UserTransaction(1, 13,"Redmi",1,35000,35000));
		System.out.println(status);
		
		/*CartDAO remo = ctx.getBean(CartDAO.class);
		long status1 = remo.remove(6);
		System.out.println(status1);
		
		int status3=dao.update(new UserTransaction(1,12,"Oneplus",1,57000,57000),new UserTransaction(1, 12, "Redmi", 2, 35000, 70000)); 
	    System.out.println(status3); */
	}
}
