package com.helloworld.helloworld.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class Objetivos {
	@GetMapping
	public String objetivos() {
		return "Objetivos da semana:\nConhecer e praticar Spring Boot\nRevisar Java\nTerminar curso de HTML5";
	}
}
