package br.org.generation.desafioCurso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.org.generation.desafioCurso.model.Aluno;
import br.org.generation.desafioCurso.servicos.IAlunoService;

@Controller
@CrossOrigin("*")
public class AlunoController {
	
	@Autowired
	private IAlunoService servico;
	
	@GetMapping("/aluno")
	public ResponseEntity<List<Aluno>> mostrarTodos(){
		return ResponseEntity.ok(servico.recuperarTodos());
	}
	@GetMapping("/aluno/{id}")
	public ResponseEntity<Aluno> mostrarAlunoId(@PathVariable int id){
		Aluno aluno = servico.recuperarAlunoId(id);
		if(aluno!=null) {
			return ResponseEntity.ok(aluno);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	@PostMapping("/aluno/novo")
	public ResponseEntity<Aluno> novoAluno(@RequestBody Aluno aluno){
		servico.novoAluno(aluno);
		return ResponseEntity.ok(aluno);
		
	}
}
