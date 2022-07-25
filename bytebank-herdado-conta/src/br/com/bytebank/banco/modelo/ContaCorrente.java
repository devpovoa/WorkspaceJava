package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	private static final long serialVersionUID = 1L;

	public ContaCorrente(int agencia, int numeroDaConta) {
		super(agencia, numeroDaConta);
	}

	@Override
	public void sacar(double valor) throws SaldoInsufucienteExecption {
		double taxaSaque = valor + 0.2;
		super.sacar(taxaSaque);
	}

	@Override
	public double getValorImposto() {

		return super.getSaldo() * 0.01;
	}

	@Override
	public String toString() {

		return "Conta Corrente, " + super.toString();
	}

}
