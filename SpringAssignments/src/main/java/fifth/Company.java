package fifth;

public class Company {
  private String cmnyName;
  private String location;
   public String getCmnyName() {
	return cmnyName;
}
public void setCmnyName(String cmnyName) {
	this.cmnyName = cmnyName;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
@Override
public String toString() {
	return "Company [cmnyName=" + cmnyName + ", location=" + location + "]";
}
  
}
