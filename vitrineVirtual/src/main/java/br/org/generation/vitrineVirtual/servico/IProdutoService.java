package br.org.generation.vitrineVirtual.servico;

import java.util.List;

import br.org.generation.vitrineVirtual.model.Produto;

public interface IProdutoService {
	public List<Produto> recuperarTodos();
	public Produto recuperarPorId(int id);
	
	
}
