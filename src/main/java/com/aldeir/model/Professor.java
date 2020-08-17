package com.aldeir.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Professor extends Pessoas implements Serializable {

	private static final long serialVersionUID = 1L;

	

	
	  @OneToMany(mappedBy = "professor") 
	  private List<Materias> materias = new ArrayList<>();
	  
	  @OneToMany(mappedBy = "professor") 
	  private List<Telefone> telefones = new ArrayList<>();
	  
	  @ManyToMany
		@JoinTable(name = "ALUNO_PROFESSOR",
		joinColumns = @JoinColumn(name = "professor_id"),
		inverseJoinColumns = @JoinColumn(name = "aluno_id"))
		private List<Aluno> alunos = new ArrayList<>();
	  
	public Professor() {
		super();
	}

	public Professor(Integer id, String nome, String email, String curso ) {
		super(id, nome, email, curso);
   
      }

	  public List<Materias> getMaterias() {
     return materias; }
	  
	  public void setMaterias(List<Materias> materias) {
		  this.materias = materias;
	  } public List<Telefone> getTelefone() { 
		  return telefones; 
		  } 
	  public void
	  setTelefone(List<Telefone> telefones) {
		  this.telefones = telefones; 
		  }
	  public List<Aluno> getAlunos() {
			return alunos;
		}
	 
		public void setAlunos(List<Aluno> alunos) {
			this.alunos = alunos;
		}

}
