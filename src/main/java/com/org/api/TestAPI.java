package com.org.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAPI {
	@GetMapping("/hello")
	public String helloworld() {
		return "hello world by Chellappan";
	}
}
