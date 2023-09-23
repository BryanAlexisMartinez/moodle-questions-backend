package com.example.questions.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.questions.model.Ensayo;

@Repository

public interface EnsayoReporitory extends JpaRepository<Ensayo, Long>{
	Optional<Ensayo> findById(int id);

}
