
package com.generation.hello_world.controller;

import java.util.*;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bsm")
public class BsmController {

	@GetMapping
	public List<String> listBsm() {
		return Arrays.asList("Trabalho em Equipe", "Orientação ao Detalhe", "Proatividade", "Comunicação",
				"Orientação ao Futuro", "Responsabilidade Pessoal", "Mentalidade de Crescimento", "Persistência");
	}
}
