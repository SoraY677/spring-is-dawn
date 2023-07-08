package com.spring.akebono.Controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping

@RestController
@RequestMapping("/api")
public class Api {
    @GetMapping("/")
    fun searchTopicById(): String{
        return "{\"message\": \"test\"}"
    }
}