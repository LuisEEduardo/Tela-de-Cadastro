package com.desenvolvimento.controller;


import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.desenvolvimento.model.Pessoa;
import com.desenvolvimento.persistence.PessoaDAO;
import com.desenvolvimento.persistence.PessoaDAOImpl;

@ManagedBean(name="PessoaController")
@SessionScoped
public class PessoaController {
	
	private Pessoa pessoa;
	
    @PostConstruct
    public void init() {
           pessoa = new Pessoa();
    }

	public void adicionarPessoa() {
		PessoaDAO dao = new PessoaDAOImpl(); 
		dao.adicionarPessoa(pessoa);
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	

}
