package br.com.alura.main;

/**
 * Classe enums usado para definir constantes.
 * 
 * @author devpovoa
 *
 */
public enum Prioridade {

	/**
	 * Níves de prioridade podem ser personalizados atravez de métodos construtores.
	 */
	MIN(1), NORMAL(5), MAX(10);

	private int valor;

	/**
	 * Método construtor que define valores de prioridade dos enums.
	 * @param valor
	 */
	private Prioridade(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
}
