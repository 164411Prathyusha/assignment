package fifth;

import javax.annotation.Resource;

public class Resource1 {
  private String userId;
  private String name;
  @Resource(name="company")
  private Company company;
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Company getCompany() {
	return company;
}
public void setCompany(Company company) {
	this.company = company;
}
@Override
public String toString() {
	return "Resource1 [userId=" + userId + ", name=" + name + ", company="
			+ company + "]";
}
  
}
