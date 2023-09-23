package com.example.questions.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.questions.model.Ensayo;
import com.example.questions.repository.EnsayoReporitory;

@Service
public class EnsayoService {
	
	private final EnsayoReporitory varEnsayoRepository;
	
	@Autowired
	public EnsayoService(EnsayoReporitory varEnsayoRepository) {
		super();
		this.varEnsayoRepository = varEnsayoRepository;
	}//constructor
	
	public List<Ensayo> getAllEnsayos() {
		return varEnsayoRepository.findAll();
	}

	public Ensayo getEnsayo(Long id) {
		return varEnsayoRepository.findById(id).orElseThrow(
				() -> new IllegalArgumentException("La pregunta con el id " + id + " no existe")
				);
	}

	public Ensayo deleteEnsayo(Long id) {
		Ensayo tmp = null;
		if (varEnsayoRepository.existsById(id)) {
			tmp = varEnsayoRepository.findById(id).get();
			varEnsayoRepository.deleteById(id);
		}
		return tmp;
	}

	//ADD NEW QUESTION 
	public Ensayo addEnsayo(Ensayo ensayo) {
		return varEnsayoRepository.save(ensayo);
	}
	
	
	
	
	

}
