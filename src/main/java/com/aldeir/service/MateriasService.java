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

	
	   public void salvarMaterias(Materias materia) {
		 
			materiasRepository.saveAll(Arrays.asList(materia));
		   
	   }
	
	
}
