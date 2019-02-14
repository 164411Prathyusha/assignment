package com.makemytrip.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.makemytrip.server.services.LoginRegistrationService;

@SpringBootApplication
@EnableCircuitBreaker
@EnableDiscoveryClient
@RestController
public class MakeMyTripBackEndApplication {
	
	@Autowired
	private LoginRegistrationService loginRegistrationService;

	public static void main(String[] args) {
		SpringApplication.run(MakeMyTripBackEndApplication.class, args);
	}
	@GetMapping("/details/user")
	public String getUser(String id) {
		return "User name and details" + loginRegistrationService.getUser(id);
	}
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}

