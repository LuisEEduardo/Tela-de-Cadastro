package com.desenvolvimento.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="seq",sequenceName="oracle_seq")        
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")    
	private int Id;
	
	@Column
	private String nome;
	
	@Column
	private String endereco;
	
	@Column
	private String telefone;

	public Pessoa() {
	}

	public Pessoa(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public int getId() {
		return Id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome: " + getNome() + "\n"); 
		sb.append("Endereço: " + getEndereco() + "\n"); 
		sb.append("Telefone: " + getTelefone() + "\n");
		return sb.toString();
	}
	
}
