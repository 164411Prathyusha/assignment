package dom.jagadish.com.SpringAssignment9;

public class Employee {

	
		   private String name;

		   public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		
		
		@Override
		public String toString() {
			return "Employee [name=" + name + "]";
		}
		public void init(){
		      System.out.println("Bean init");
		   }
		   public void destroy() {
		      System.out.println("Bean destroy");
		   }
		
	
}
