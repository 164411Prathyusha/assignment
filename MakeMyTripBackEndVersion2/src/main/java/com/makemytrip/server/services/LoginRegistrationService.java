package com.makemytrip.server.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.makemytrip.server.model.User;
import com.makemytrip.server.repository.LoginRegistrationRepository;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class LoginRegistrationService {

	//@Autowired
	private LoginRegistrationRepository loginRegistrationRepository;
	@Autowired
	private RestTemplate restTemplate;

	public List<User> getAllUsers() {

		return loginRegistrationRepository.findAll();

	}


	@HystrixCommand(fallbackMethod = "unknown")
	public User getUser(String id) {

		//return loginRegistrationRepository.findById(id).get();
		return restTemplate.getForEntity("http://loginregistration-service/user", 
				User.class)
				.getBody();
		
	}

	public User addUser(User user) {
		return loginRegistrationRepository.save(user);
	}

	public User updateUser(String id, User user) {
		
		user.setId(id);
		return loginRegistrationRepository.save(user);

	}

	
	  public void deleteUser(String id) {
		  loginRegistrationRepository.deleteById(id); 
	 
	  }
	  
	
	  public String loginUserValidate(User loginUser) {
		  
				List<User> reges = loginRegistrationRepository.findAll();
				for (User list1 : reges) {

					if ((loginUser.getEmail().equals(list1.getEmail())) && (loginUser.getPassword().equals(list1.getPassword())))  {
						return "valid User";
					}
				}
				return "Invalid Password and userId";
			}

		  	
	  public void changeOldPassword(String email,String password)
	  {
		  List<User> user = loginRegistrationRepository.findAll();
			for (User list2 : user) 
			{
			if(email.matches(email)) 
			{
				
				list2.setPassword(password);
				
			}
			}
            

}
	  public String unknown(String id, Exception e) {
		  System.out.println("Fallback error. Reason: " + e.getMessage());
			return "unknown";
		}
}