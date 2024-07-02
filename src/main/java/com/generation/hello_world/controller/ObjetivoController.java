package com.generation.hello_world.controller;

import java.util.*;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/objetivos-aprendizagem")
public class ObjetivoController {

	@GetMapping
	public List<String> listObjetivos() {
		return Arrays.asList("Aprender Spring", "Estudar o conteúdo do cookbook", "Entregar todas as atividades");

	}
}
