package com.spring.akebono.Controller

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model
import com.spring.akebono.Util.PathUtil

@Controller
class HelloController {
	@RequestMapping(value = arrayOf("/"))
	fun index(model: Model):String {
		model.addAttribute("PathUtil", PathUtil())
		return "index"
	}
}