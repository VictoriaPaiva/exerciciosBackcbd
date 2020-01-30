package br.org.generation.desafioCurso.servicos;

import java.util.List;

import br.org.generation.desafioCurso.model.Curso;

public interface ICursoService {
 
	public void adicionarNovoCurso(Curso curso);
	public Curso recuperarDetalhes(int id);
	public List<Curso> recuperarTodos();
}
