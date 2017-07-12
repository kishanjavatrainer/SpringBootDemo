package com.infotech.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(value="/hello")
	public String welcome(){
		return "Welcome to Spring boot world!!";
	}
}
