package com.aldeir.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.aldeir.model.Aluno;
import com.aldeir.model.Materias;
import com.aldeir.model.Professor;
import com.aldeir.service.AlunoService;
import com.aldeir.service.MateriasService;
import com.aldeir.service.ProfessorService;


@Controller
@RequestMapping("/Aluno")
public class PortalController {
	
	@Autowired
	private AlunoService  alunoService;
	
	@Autowired
	private MateriasService materiaService;
	
	@Autowired
	private ProfessorService professorService;
	
	
	@RequestMapping( "/Dashboard")
	public String novo() {
		return "CadastrarProfessor";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String salva(Aluno cadastraAluno ) {
	
	 alunoService.salvar(cadastraAluno);
		return "CadastraAluno";
	}
	@RequestMapping( "/Logado")
	public ModelAndView buscar(){
List<Aluno> aluno = alunoService.buscar();
		 ModelAndView mv = new ModelAndView("home");
		 mv.addObject("aluno",aluno);
		
		return mv;
	}
	@RequestMapping(value = "/professor", method = RequestMethod.POST)
	public String salvarProfessor(Professor professor) {
		professorService.salvarProfessor(professor);
		
		return "/Aluno/Dashboard";
	}
	

}
