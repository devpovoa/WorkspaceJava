package br.com.bytebank.banco.modelo;

/**
 * Classe mais generica que inicializa um Array e armazana nela.
 * 
 * @author devpovoa
 *
 */
public class GuardadorDeReferencias {

	private Object[] referencias;
	private int posicaoLivre;

	/**
	 * Método publico para ser chamado ao criar a classe.
	 */
	public GuardadorDeReferencias() {
		this.referencias = new Object[10];
		this.posicaoLivre = 0;
	}

	/**
	 * Método que atribui uma conta no array com a possição livre.
	 * 
	 * @param ref
	 */
	public void adiciona(Object ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}

	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}

	public Object getReferencia(int pos) {
		return this.referencias[pos];
	}
}
