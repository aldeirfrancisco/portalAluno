package com.aldeir.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Professor extends Pessoas implements Serializable {

	private static final long serialVersionUID = 1L;

	

	@OneToMany(cascade = CascadeType.ALL)
	private List<Materias> materias = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name = "alunos_professor", joinColumns = @JoinColumn(name = "alunos_id"), inverseJoinColumns = @JoinColumn(name = "professor_id"))
	private List<Aluno> alunos = new ArrayList<>();

	  public Professor(){
		  
	  }
	

	public Professor(Integer id, String nome, String email, String curso) {
		super(id, nome, email, curso);
		
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}
  public void aluno(Aluno aluno) {
	  alunos.add(aluno);
  }
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public List<Materias> getMaterias() {
		return materias;
	}

	public void setMaterias(List<Materias> materias) {
		this.materias = materias;
	}

}
