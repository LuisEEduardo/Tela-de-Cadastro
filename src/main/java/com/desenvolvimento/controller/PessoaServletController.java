package com.desenvolvimento.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.desenvolvimento.model.Pessoa;

@WebServlet("/CadastroPessoa")
public class PessoaServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PessoaServletController() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
		String telefone = request.getParameter("telefone");
		
		PessoaController pessoaController = new PessoaController();
		
		// pessoaController.setPessoa(new Pessoa(nome, endereco, telefone));
		
		// teste -------
		Pessoa pessoa = new Pessoa(nome, endereco, telefone); 
		// pessoa.setId(3);
		pessoaController.setPessoa(pessoa);
		// ------------
		
		pessoaController.adicionarPessoa();
		
		PrintWriter out = response.getWriter();
		out.println("<html><body> Pessoa cadastrada com sucesso! </body></html>");
		
	}

}
