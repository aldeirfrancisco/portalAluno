package com.aldeir.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Professor extends Pessoas implements Serializable {
	

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToMany
	@JoinTable(name = "aluno_professor",
    joinColumns = @JoinColumn(name="aluno_professor_id"),//nome do campo da tabela corespondete ao produto
	 inverseJoinColumns = @JoinColumn(name = "aluno_id"))//chave estrageira)
	private List<Aluno> alunos = new ArrayList<>();

	public Professor(String nome, String email, String curso, Integer id) {
		super(nome, email, curso);
		this.id = id;
		
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

}
