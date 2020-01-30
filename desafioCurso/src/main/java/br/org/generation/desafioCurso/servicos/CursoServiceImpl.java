package br.org.generation.desafioCurso.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.generation.desafioCurso.dao.CursoRepo;
import br.org.generation.desafioCurso.model.Curso;

@Component
public class CursoServiceImpl implements ICursoService{

	
	@Autowired
	public CursoRepo repo;
	
	@Override
	public void adicionarNovoCurso(Curso curso) {
		// TODO Auto-generated method stub
		repo.save(curso);
		
	}

	@Override
	public Curso recuperarDetalhes(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public List<Curso> recuperarTodos() {
		// TODO Auto-generated method stub
		return (List<Curso>)repo.findAll();
	}
	

}
