package com.cts.training.helloservice;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloRestController {

	
	@GetMapping("/hello")
	public String HelloWorld() {
		return "Hello";
	}
}
