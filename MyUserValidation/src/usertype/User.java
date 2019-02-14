package usertype;

public class User {
 String Username;
 String Password;
 String UserType;
public User(String username, String password, String userType) {
	super();
	Username = username;
	Password = password;
	UserType = userType;
}
public String getUsername() {
	return Username;
}
public void setUsername(String username) {
	Username = username;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getUserType() {
	return UserType;
}
public void setUserType(String userType) {
	UserType = userType;
}
@Override
public String toString() {
	return "User [Username=" + Username + ", Password=" + Password
			+ ", UserType=" + UserType + "]";
}
 
}
