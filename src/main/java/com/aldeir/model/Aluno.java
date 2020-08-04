package com.aldeir.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Aluno  extends Pessoas implements Serializable {
	


	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String matricula;
	
	private Integer turno;
	
	
	@ManyToMany(mappedBy = "alunos")
   private List<Professor> professores = new ArrayList<>();

	
	
	public Aluno(String nome, String email, String curso, Integer id, String matricula, Integer turno) {
	super(nome, email, curso);
	this.id = id;
	this.matricula = matricula;
	this.turno = turno;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public Turno getTurno() {
		return Turno.toEnum(turno);
	}
	public void setTurno(Turno turno) {
		this.turno = turno.getCod();
	}
	
	public List<Professor> getProfessores() {
		return professores;
	}
	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}
}
