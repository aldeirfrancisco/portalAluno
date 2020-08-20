package com.aldeir.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aldeir.model.Materias;
import com.aldeir.model.Professor;
import com.aldeir.model.Telefone;
import com.aldeir.service.ProfessorService;


@Controller
@RequestMapping( "/novo")
public class ProfessorController {
	
	
	
	@Autowired
	private ProfessorService professorService;
	
	
	@RequestMapping(method = RequestMethod.POST,value = "/professor")
	public String salvarProfessor(Professor professor,Materias materia, Telefone telefone) {
		professorService.salvarProfessor(professor,materia,telefone);
		
		return "CadastrarProfessor";
	}
	

}
