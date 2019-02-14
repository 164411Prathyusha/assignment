package dom.jagadish.com.SpringAssignment8;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {
	
	public Integer id;
	public String name;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	@PostConstruct
	public void init(){
		System.out.println("Before intialization ");
	}
	
	@PreDestroy
	public void clean(){
		System.out.println("After destroy ");
	}
	
}
