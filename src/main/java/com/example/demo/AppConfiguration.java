package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
// Because we are using urls and a webserver, we need to use a REST controller
public class AppConfiguration {
	
	@RequestMapping("/hello")		
	// on the webserver, the url will have https://localhost:808x
	// we then need to add the page url: /hello
	public String hello()
	{
		return "Hello World! from Sosthene";
	}

}
