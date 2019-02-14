package usertype;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserDAO {
   ArrayList<User>userList;

public UserDAO() {
    userList= new ArrayList<User>();
    userList.add(new User("Prathyusha","123","Admin"));
    userList.add(new User("Bunny","253","User"));
    userList.add(new User("Radha","234","User"));
}
  public String getUserType(String Username, String Password){
	  List<String> obj= userList.stream().filter(user->user.getUsername().equals(Username)&&user.getPassword().equals(Password))
				.map(user->user.getUserType())
				.collect(Collectors.toList());
				if(!obj.isEmpty())
					return obj.get(0);
				//throw new InvalidUserException("No User Found");
				return "no User found";
  }
}
