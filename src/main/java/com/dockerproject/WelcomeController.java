package com.dockerproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class WelcomeController {
	
	@GetMapping("welcome")
	public String greeting() {
		System.out.println("Welcome to docker tutorial");
		return "Welcome to docker tutorial";
	}

}
