package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

	@GetMapping("test-message")
	public String getMessage() {
		return "Hello world for URI test-message!....Hi siri, welcome to docker practice";
	}
}
