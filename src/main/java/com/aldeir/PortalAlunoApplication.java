package com.aldeir;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aldeir.model.Aluno;
import com.aldeir.model.Materias;
import com.aldeir.model.Professor;
import com.aldeir.model.Telefone;
import com.aldeir.model.Turno;
import com.aldeir.repository.AlunoRepository;
import com.aldeir.repository.MateriasRepository;
import com.aldeir.repository.ProfessorRepository;
import com.aldeir.repository.TelefoneRepository;
import com.aldeir.service.AlunoService;

@SpringBootApplication
public class PortalAlunoApplication implements CommandLineRunner {

	@Autowired
	private ProfessorRepository  professorRepository;

	@Autowired
	private AlunoRepository alunoRepository;
	
	@Autowired
	private MateriasRepository materiasRepository;
	
	@Autowired
	private TelefoneRepository   telefoneRepository;  

	public static void main(String[] args) {
		SpringApplication.run(PortalAlunoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Telefone alun_telefone = new Telefone(null, "61  981888792");
		Telefone prof_telefone = new Telefone(null, "61 99988619");
		Professor professor = new Professor(null, "rogerio","rogerio@gmail.com","tads");
	
		Aluno aluno = new Aluno("aldeir","aldeir@gmail.com","tads",null, Turno.NOTUTNO);
		Materias materia = new Materias(null, "projeto integrado",professor);
		professor.getAlunos().addAll(Arrays.asList(aluno));
		professor.getMaterias().addAll(Arrays.asList(materia));
		professor.getTelefone().addAll(Arrays.asList(prof_telefone));
		
		aluno.getProfessores().addAll(Arrays.asList(professor));
		aluno.getMaterias().addAll(Arrays.asList(materia));
		aluno.getTelefone().addAll(Arrays.asList(alun_telefone));
		
		alun_telefone.setAluno(aluno);
		prof_telefone.setProfessor(professor);
		
		materia.getAluno().addAll(Arrays.asList(aluno));
		materia.setProfessores(professor);
		
		alunoRepository.saveAll(Arrays.asList(aluno));
		professorRepository.saveAll(Arrays.asList(professor));
		telefoneRepository.saveAll(Arrays.asList(alun_telefone, prof_telefone));
		
		materiasRepository.saveAll(Arrays.asList(materia));
		
		  
		
	}

}
