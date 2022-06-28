package com.helloworld.helloworld.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/BSM")
public class BSM {
	@GetMapping
	public String helloWorld() {
		return "Lista de BSM - Generation:\nOrientação ao futuro.\nResponsabilidade Pessoal."
				+ "\nMentalidade de Crescimento.\nPersistência.\nTrabalho em Equipe."
				+ "\nAtenção aos Detalhes.\nProatividade.\nComunicação.";
	}
}
