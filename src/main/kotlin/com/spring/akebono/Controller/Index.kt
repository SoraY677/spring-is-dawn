package com.spring.akebono.Controller

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class HelloController {
	@RequestMapping(value = arrayOf("/"))
	fun index():String {
		return "index"
	}
}