package com.aldeir.model;

import java.util.HashSet;
import java.util.Set;

public class Pessoas {
   
	
	private String nome;
	private String email;
	private String curso;
	
	private Set<String> materia = new HashSet<>();
	
	private Set<String> telefone = new HashSet<>();
	
    public Pessoas(String nome, String email, String curso) {
		super();
		this.nome = nome;
		this.email = email;
		this.curso = curso;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	 public Set<String> getMateria() {
		return materia;
	}
	 public void setMateria(Set<String> materia) {
		this.materia = materia;
	}
	public Set<String> getTelefone() {
		return telefone;
	}

	public void setTelefone(Set<String> telefone) {
		this.telefone = telefone;
	}
	 
	
}
