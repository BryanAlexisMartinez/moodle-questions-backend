package com.example.questions.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.questions.model.Ensayo;
import com.example.questions.model.Respuesta;
import com.example.questions.model.RespuestaDetallesDTO;
import com.example.questions.service.EnsayoService;
import com.example.questions.service.RespuestaService;

@RestController
@RequestMapping("/api/respuesta/")
public class RespuestaController {

	private final RespuestaService varRespuestaService;
	private final EnsayoService varEnsayoService;

	@Autowired
	public RespuestaController(RespuestaService vaRespuestaService, EnsayoService varEnsayoService) {
		this.varRespuestaService = vaRespuestaService;
		this.varEnsayoService = varEnsayoService;
	}

	// GET PREGUNTAS ENSAYO
	@GetMapping
	public List<Respuesta> getAllRespuestas() {
		return varRespuestaService.getAllRespuestas();
	}
	
	// GET todas las respuestas relacionadas con una pregunta por su nombre
    @GetMapping("/pregunta/{nombrePregunta}")
    public ResponseEntity<List<Respuesta>> getRespuestasPorNombrePregunta(@PathVariable("nombrePregunta") String nombrePregunta) {
        List<Respuesta> respuestas = varRespuestaService.getRespuestasPorNombrePregunta(nombrePregunta);
        return ResponseEntity.ok(respuestas);
    }

	// GET PREGUNTA ENSAYO POR SU ID
	@GetMapping(path = "{respuestaId}")
	public Respuesta getRespuestas(@PathVariable("respuestaId") Long id) {
		return varRespuestaService.getRespuesta(id);
	}

	// GET PREGUNTA ENSAYO POR SU ID
	@DeleteMapping(path = "{respuestaId}")
	public Respuesta deleteRespuestas(@PathVariable("respuestaId") Long id) {
		return varRespuestaService.deleteRespuesta(id);
	}
	
	@PostMapping
	public Respuesta addRespuesta(@RequestBody Respuesta respuesta) {
	return varRespuestaService.addRespuesta(respuesta);	
	}

	
}
