package com.aldeir.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aldeir.model.Aluno;
import com.aldeir.model.Materias;
import com.aldeir.model.Professor;
import com.aldeir.repository.MateriasRepository;

@Service
public class MateriasService {
	
	@Autowired
	private MateriasRepository materiasRepository;

	
	   public void salvarMaterias(Materias materia,Aluno aluno,Professor professor) {
		  materia.getAluno().addAll(Arrays.asList(aluno));
			materia.setProfessores(professor);
			materiasRepository.saveAll(Arrays.asList(materia));
		   
	   }
	
	
}
