package com.example.travisci;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TravisController {
	
	@PostMapping("/hello")
	public String helloworld() {
		// return
		return "hello world !!! ";
	}

}
