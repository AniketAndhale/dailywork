package com.cts.training.app.dockerservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CtsRestController {
	@GetMapping("/hello")
	public String sayHello() {
		return "Good Morning";
	}

	
	@GetMapping("/languages")
	public List<String> languages()
	{
		return new ArrayList<String>(Arrays.asList("c","c++","python","java","ruby","c#"));
	}
}
