package com.ess.docker_kubernetes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerServiceController {
	
	@GetMapping("/customerService")
	public String sayHello() {
		return "Docker Customer Service is up.";
	}

}
