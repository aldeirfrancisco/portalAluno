package com.aldeir.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aldeir.model.Aluno;


public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

	

}
