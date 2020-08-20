package com.aldeir.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aldeir.model.Telefone;
import com.aldeir.repository.TelefoneRepository;

@Service
public class TelefoneService {
	
	@Autowired
	private TelefoneRepository telefoneRepository;
	

	public void salvarTelefone(Telefone telefone) {
	 telefoneRepository.save(telefone);
	}
	
	
	
}
