package com.spring.akebono.Controller

import java.net.URL;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.akebono.Data.ApiData

@Controller
class HelloController {
	@RequestMapping(value = arrayOf("/"))
	fun index(model: Model):String {
		val mapper = ObjectMapper();

		val response = mapper.readValue<ApiData>(
			URL("http://localhost:8080/api/"),
			ApiData::class.java
		)

		model.addAttribute("jsonData", response)
		return "index"
	}
}