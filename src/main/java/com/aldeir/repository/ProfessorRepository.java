package com.aldeir.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aldeir.model.Aluno;
import com.aldeir.model.Professor;


public interface ProfessorRepository extends JpaRepository<Professor, Integer> {

	

}
