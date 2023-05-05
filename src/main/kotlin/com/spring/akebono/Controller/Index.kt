package com.spring.akebono.Controller
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
	@GetMapping("/")
	fun index():String {
		return "Greetings from Spring Boot!"
	}
}