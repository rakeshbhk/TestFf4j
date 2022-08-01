package com.ff4j.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {


	//@Autowired
	//public FF4j ff4j;


	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "text/html")
	public String get() {
		System.out.println("Hello");
		return "Hi FF4J";
	}

}
