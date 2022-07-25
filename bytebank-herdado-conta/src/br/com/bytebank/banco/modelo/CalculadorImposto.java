package br.com.bytebank.banco.modelo;

public class CalculadorImposto {

	private double totalImposto;

	public void regitra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}

	public double getTotalImposto() {
		return this.totalImposto;
	}
}
