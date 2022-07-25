package br.com.alura.io.teste;

import java.io.Serializable;

public class Cliente implements Serializable {

	private static final long serialVersionUID = -7911228947337294065L;
	private String nome;
	private String cpf;
	private String profissao;

	public String getNomeCpf() {
		return this.nome + ", " + this.cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
