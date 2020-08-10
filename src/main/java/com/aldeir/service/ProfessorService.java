package com.aldeir.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aldeir.model.Professor;
import com.aldeir.repository.ProfessorRepository;

@Service
public class ProfessorService {
	
	@Autowired
	private ProfessorRepository  professorRepository;

	
	   public void salvarProfessor(Professor professor) {
		   professorRepository.save(professor);
		   
	   }
	
	
}
