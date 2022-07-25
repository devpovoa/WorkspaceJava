package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Caso queira retirar a classe Cliente da serializaçao, na classe conta add a
 * palavra transient para omitir a Serialização da classe.
 * 
 * @author devpovoa
 *
 */
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nome;
	private String cpf;
	private String profissao;

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
