package com.aldeir.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aldeir.model.Materias;
import com.aldeir.model.Professor;
import com.aldeir.repository.MateriasRepository;
import com.aldeir.repository.ProfessorRepository;

@Service
public class MateriasService {
	
	@Autowired
	private MateriasRepository materiasRepository;

	
	   public void salvarMaterias(Materias materias) {
		   materiasRepository.save(materias);
		   
	   }
	
	
}
