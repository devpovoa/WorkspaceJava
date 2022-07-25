package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {

	private static final long serialVersionUID = 1L;

	public ContaPoupanca(int agencia, int numeroDaConta) {
		super(agencia, numeroDaConta);
	}

	@Override
	public String toString() {
		
		return "Conta Poupaça, " + super.toString();
	}
}
