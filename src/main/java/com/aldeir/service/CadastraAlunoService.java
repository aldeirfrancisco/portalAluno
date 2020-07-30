package com.aldeir.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aldeir.model.CadastraAluno;
import com.aldeir.repository.CadastraAlunoRepository;

@Service
public class CadastraAlunoService {
	
	@Autowired
	private CadastraAlunoRepository cadastraAlunoRepository;
	
	public void salvar(CadastraAluno aluno) {
	 cadastraAlunoRepository.save(aluno);
	}
	
	public List<CadastraAluno> buscar() {
		
		List<CadastraAluno> aluno = cadastraAlunoRepository.findAll();
		
		return aluno;
	}
	
	
	public CadastraAlunoRepository getCadastraAlunoRepository() {
		return cadastraAlunoRepository;
	}
}
