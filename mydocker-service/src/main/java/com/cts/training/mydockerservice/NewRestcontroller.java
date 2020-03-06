package com.cts.training.mydockerservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewRestcontroller {
	@GetMapping("/sai")
public int Add()
{
		return 12;
}
}
