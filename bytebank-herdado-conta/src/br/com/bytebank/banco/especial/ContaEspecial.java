package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Conta;

public class ContaEspecial extends Conta {

	private static final long serialVersionUID = 1L;

	public ContaEspecial(int agencia, int numeroDaConta) {
		super(agencia, numeroDaConta);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
}
