package com.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DataController {

	@GetMapping("/hello")
	public String sayHello() {
		
		return "Hello";		
		
	}
}
