package br.org.generation.desafioCurso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.desafioCurso.model.Curso;
import br.org.generation.desafioCurso.servicos.ICursoService;

@RestController
@CrossOrigin("*")
public class CursoController {

	@Autowired
	private ICursoService servico;
	
	@PostMapping("/curso/novo")
	public ResponseEntity<Curso> incluirCurso(@RequestBody Curso curso){
		servico.adicionarNovoCurso(curso);
		return ResponseEntity.ok(curso);
	}
	@GetMapping("/curso/todos")
	public ResponseEntity<List<Curso>> listarTodos(){
		return ResponseEntity.ok(servico.recuperarTodos());
	}
	@GetMapping("/curso/{id}")
	public ResponseEntity<Curso> listarDetalhes(@PathVariable int id){
		Curso curso = servico.recuperarDetalhes(id);
		if(curso!=null) {
			return ResponseEntity.ok(curso);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
}
