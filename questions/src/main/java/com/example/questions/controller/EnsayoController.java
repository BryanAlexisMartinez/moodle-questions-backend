package com.example.questions.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.questions.model.Ensayo;
import com.example.questions.service.EnsayoService;

@RestController
@RequestMapping("/api/ensayo/")
public class EnsayoController {

	// Variable para acceder al EnsayoService para los metodos
	private final EnsayoService varEnsayoService;

	@Autowired
	public EnsayoController(EnsayoService varEnsayoService) {
		this.varEnsayoService = varEnsayoService;
	}

	// GET PREGUNTAS ENSAYO
	@GetMapping
	public List<Ensayo> getAllEnsayos() {
		return varEnsayoService.getAllEnsayos();
	}

	// GET PREGUNTA ENSAYO POR SU ID
	@GetMapping(path = "{ensayoId}")
	public Ensayo getEnsayos(@PathVariable("ensayoId") Long id) {
		return varEnsayoService.getEnsayo(id);
	}

	// GET PREGUNTA ENSAYO POR SU ID
	@DeleteMapping(path = "{ensayoId}")
	public Ensayo deleteEnsayos(@PathVariable("ensayoId") Long id) {
		return varEnsayoService.deleteEnsayo(id);
	}
	
	@PostMapping
	public Ensayo addEnsayos(@RequestBody Ensayo ensayo) {
	return varEnsayoService.addEnsayo(ensayo);	
	}
	
}
