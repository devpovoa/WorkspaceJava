package br.com.bytebank.banco.modelo;

public class SaldoInsufucienteExecption extends Exception {

	private static final long serialVersionUID = 1L;

	public SaldoInsufucienteExecption(String messeger) {
		super(messeger);
	}
}
