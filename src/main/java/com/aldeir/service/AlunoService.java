package com.aldeir.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aldeir.model.Aluno;
import com.aldeir.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	public void salvar(Aluno aluno) {
	 alunoRepository.save(aluno);
	}
	
	public List<Aluno> buscar() {
		
		List<Aluno> aluno = alunoRepository.findAll();
		
		return aluno;
	}
	
	
	public AlunoRepository getCadastraAlunoRepository() {
		return alunoRepository;
	}
}
