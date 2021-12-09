package com.desenvolvimento.persistence;

import java.util.List;

import com.desenvolvimento.model.Pessoa;

public interface PessoaDAO {

	public void adicionarPessoa(Pessoa pessoa); 
	public List<Pessoa> listarPessoa();
	public void excluirPessoa(Pessoa pessoa);
	
}
