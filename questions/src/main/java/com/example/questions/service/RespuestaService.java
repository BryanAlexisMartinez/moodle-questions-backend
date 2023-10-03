package com.example.questions.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.questions.model.Ensayo;
import com.example.questions.model.Respuesta;
import com.example.questions.repository.RespuestaRepository;

@Service
public class RespuestaService {
	
	private final RespuestaRepository varRespuestaRepository;
	
	@Autowired
	public RespuestaService(RespuestaRepository varRespuestaRepository) {
		super();
		this.varRespuestaRepository = varRespuestaRepository;
	}//constructor
	

	public List<Respuesta> getAllRespuestas() {
		return varRespuestaRepository.findAll();
	}


	public Respuesta getRespuesta(Long id) {
		return varRespuestaRepository.findById(id).orElseThrow(
				() -> new IllegalArgumentException("La respuesta con el id " + id + " no existe")
				);
	}


	public Respuesta deleteRespuesta(Long id) {
		Respuesta tmp = null;
		if (varRespuestaRepository.existsById(id)) {
			tmp = varRespuestaRepository.findById(id).get();
			varRespuestaRepository.deleteById(id);
		}
		return tmp;
	}


	public Respuesta addRespuesta(Respuesta respuesta) {
		return varRespuestaRepository.save(respuesta);
	}


	// Obtener respuestas por nombre de pregunta
    public List<Respuesta> getRespuestasPorNombrePregunta(String nombrePregunta) {
        return varRespuestaRepository.findByNombrePregunta(nombrePregunta);
    }


}
