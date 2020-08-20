package com.aldeir.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aldeir.model.Materias;
import com.aldeir.model.Professor;
import com.aldeir.model.Telefone;
import com.aldeir.repository.ProfessorRepository;
import com.aldeir.repository.TelefoneRepository;

@Service
public class ProfessorService {
	
	@Autowired
	private ProfessorRepository  professorRepository;
    @Autowired
    private MateriasService materias;
    @Autowired
    private TelefoneService telefones;
	
	   public void salvarProfessor(Professor professor,Materias materia, Telefone telefone ) {
			materias.salvarMaterias(materia);
			telefones.salvarTelefone(telefone);
			professor.getMaterias().addAll(Arrays.asList(materia));
			professor.getTelefone().addAll(Arrays.asList(telefone));
			
			professorRepository.saveAll(Arrays.asList(professor));
	   }
	
	
}
