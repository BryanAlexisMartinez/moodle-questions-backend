package com.example.questions.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.questions.model.Respuesta;

@Repository
public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {
	Optional<Respuesta> findById(int id);

	List<Respuesta> findByNombrePregunta(String nombrePregunta);

}
