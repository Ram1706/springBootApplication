package com.springBoot.springBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to app development";
	}
	
	

}
