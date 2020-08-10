package com.aldeir;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aldeir.model.Aluno;
import com.aldeir.model.Materias;
import com.aldeir.model.Professor;
import com.aldeir.model.Turno;
import com.aldeir.repository.AlunoRepository;
import com.aldeir.repository.MateriasRepository;
import com.aldeir.repository.ProfessorRepository;

@SpringBootApplication
public class PortalAlunoApplication implements CommandLineRunner {

	@Autowired
	private ProfessorRepository  professorRepository;

	@Autowired
	private AlunoRepository alunoRepository;
	
	@Autowired
	MateriasRepository materiasRepository; 

	public static void main(String[] args) {
		SpringApplication.run(PortalAlunoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Professor professor = new Professor(null, "rogerio","rogerio@gmail.com","tads");
		Aluno aluno = new Aluno("aldeir","aldeir@gmail", "tads",null , 12345, Turno.MATUTINO);
		Materias materia = new Materias(null, "projeto integrado",professor);
		professor.getTelefone().addAll(Arrays.asList("61 994569164","61 818178792"));
		aluno.getTelefone().addAll(Arrays.asList("61 994060164","61 818888792"));
		
		
		
		materiasRepository.saveAll(Arrays.asList(materia));
		professorRepository.saveAll(Arrays.asList(professor));
		alunoRepository.saveAll(Arrays.asList(aluno));
	 
		professor.getAlunos().addAll(Arrays.asList(aluno));
		professor.getMaterias().addAll(Arrays.asList(materia));
		
		  
		 aluno.getProfessores().addAll(Arrays.asList(professor));
		 aluno.getMaterias().addAll(Arrays.asList(materia));
		 
		 materia.getAluno().addAll(Arrays.asList(aluno));
		
		
	}

}
