package com.example.springboot.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/user")
public class UserController {

@GetMapping	
	public List<User> getUser(){
		return Arrays.asList(
			new User("sam",500L),
			new User("Chay",900L)
);}

   @GetMapping("/{Username}")
   public User getUser(@PathVariable("Username") final String userName) {
	   return new User(userName,500L);
   }
   
}
