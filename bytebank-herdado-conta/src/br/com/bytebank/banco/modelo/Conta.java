package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe que representa a moldura de uma conta.
 * 
 * @author devpovoa
 * @version 0.1
 */
public abstract class Conta extends Object implements Comparable<Conta>, Serializable {

	private static final long serialVersionUID = 1L;
	private Cliente titular;
	private int agencia;
	private int numeroDaConta;
	protected double saldo;
	private static int total = 0;

	/**
	 * Construtor para inicializar o objeto Conta a partir da agencia e número.
	 * 
	 * @param agencia
	 * @param numeroDaConta
	 */
	public Conta(int agencia, int numeroDaConta) {
		Conta.total++;

		if (agencia <= 0) {
			System.out.println("Valor menor ou igual a zero não é permitido");
			return;
		}
		this.agencia = agencia;

		if (numeroDaConta <= 0) {
			System.out.println("Valor menor ou igual a zero não é permitido");
			return;
		}
		this.numeroDaConta = numeroDaConta;

	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	/**
	 * Valor precisa ser maior que o saldo.
	 * 
	 * @param valor
	 * @throws SaldoInsufucienteExecption
	 */
	public void sacar(double valor) throws SaldoInsufucienteExecption {
		if (this.saldo < valor) {
			throw new SaldoInsufucienteExecption("saldo: " + this.saldo + ", valor: " + valor);
		}
		this.saldo -= valor;
	}

	/**
	 * Método para depositar válidado pelo método sacar.
	 * 
	 * @param valor
	 * @param destino
	 * @throws SaldoInsufucienteExecption
	 */
	public void transfere(double valor, Conta destino) throws SaldoInsufucienteExecption {
		this.sacar(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumeroDaConta() {
		return this.numeroDaConta;
	}

	// public void setNumeroDaConta(int numeroDaConta) {}

	public int getAgencia() {
		return this.agencia;
	}

	// public void setAgencia(int agencia) {}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return Conta.total;
	}

	@Override
	public boolean equals(Object ref) {
		Conta outraConta = (Conta) ref;

		if (this.agencia != outraConta.agencia) {
			return false;
		}
		if (this.numeroDaConta != outraConta.numeroDaConta) {
			return false;
		}
		return true;
	}

	@Override
	public int compareTo(Conta outra) {

		return Double.compare(this.saldo, outra.saldo);
	}

	@Override
	public String toString() {

		return "Número: " + this.numeroDaConta + ", Agencia: " + this.agencia + "saldo: " + this.saldo;
	}
}