package com.generation.hello_world.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}
}
