package com.aldeir.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.aldeir.model.CadastraAluno;
import com.aldeir.service.CadastraAlunoService;

@Controller
@RequestMapping("/Aluno")
public class PortalController {
	
	@Autowired
	private CadastraAlunoService  cadastraAlunoService;
	
	
	
	@RequestMapping( "/Dashboard")
	public String novo() {
		return "CadastraAluno";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String salva(CadastraAluno cadastraAluno ) {
	
	 cadastraAlunoService.salvar(cadastraAluno);
		return "CadastraAluno";
	}
	@RequestMapping( "/Logado")
	public ModelAndView buscar(){
List<CadastraAluno> aluno = cadastraAlunoService.buscar();
		 ModelAndView mv = new ModelAndView("home");
		 mv.addObject("aluno",aluno);
		
		return mv;
	}

}
