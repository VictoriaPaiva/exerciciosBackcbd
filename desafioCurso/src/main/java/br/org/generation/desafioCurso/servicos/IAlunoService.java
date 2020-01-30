package br.org.generation.desafioCurso.servicos;

import java.util.List;

import br.org.generation.desafioCurso.model.Aluno;

public interface IAlunoService {
public List<Aluno> recuperarTodos();
public Aluno recuperarAlunoId(int id);
public void novoAluno(Aluno aluno);
}
