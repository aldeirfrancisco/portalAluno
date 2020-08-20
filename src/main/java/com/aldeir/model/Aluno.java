package com.aldeir.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class Aluno extends Pessoas implements Serializable {
	




	private static final long serialVersionUID = 1L;
	
	
	private Integer matricula;
	private Integer turno;
	
	@ManyToMany(mappedBy = "alunos")
	private List<Materias> materias = new ArrayList<>();

	
	@OneToMany(mappedBy = "aluno")
	private List<Telefone> telefones = new ArrayList<>();
	
/*
	@ManyToMany(mappedBy = "alunos" )
   private List<Professor> professores = new ArrayList<>();
	
	*/
	public Aluno() {
	}
	


	public Aluno(String nome, String email, String curso, Integer id, Turno turno) {
		super(id,nome, email, curso);
	  
		this.turno = turno.getCod();
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	
	public Turno getTurno() {
		return Turno.toEnum(turno);
	}
	public void setTurno(Turno turno) {
		this.turno = turno.getCod();
	}
	
	
	public List<Materias> getMaterias() {
		return materias;
	}
	public void setMaterias(List<Materias> materias) {
		this.materias = materias;
	}
	
	public List<Telefone> getTelefone() {
		return telefones;
	}
	public void setTelefone(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	/*
	public List<Professor> getProfessores() {
		return professores;
	}
	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}*/
	}
	