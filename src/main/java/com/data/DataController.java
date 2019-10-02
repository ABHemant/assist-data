package com.data;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DataController {
	
	@Autowired
	CamelContext camelContext;

	@Autowired
	ProducerTemplate producerTemplate;

	@GetMapping("/hello")
	public String sayHello() {
		
		return "Hello";		
	}

	@RequestMapping(value = "/router")
	public void startCamel() {
		producerTemplate.sendBody("direct:firstRoute", "Calling via Spring Boot Rest Controller");
	}
}
