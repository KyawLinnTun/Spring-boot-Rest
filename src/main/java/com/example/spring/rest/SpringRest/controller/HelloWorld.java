package com.example.spring.rest.SpringRest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@GetMapping(value = "/hello")
	public String helloWord() {
		String hello = "Hello World";
		return hello;
	}
}
