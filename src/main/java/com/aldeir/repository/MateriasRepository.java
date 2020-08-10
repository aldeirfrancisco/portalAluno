package com.aldeir.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aldeir.model.Aluno;
import com.aldeir.model.Materias;


public interface MateriasRepository extends JpaRepository<Materias, Integer> {

	

}
