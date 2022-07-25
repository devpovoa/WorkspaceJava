package br.com.bytebank.banco.modelo;

/**
 * Classe que inicializa um Array e armazana Contas nela.
 * 
 * @author devpovoa
 *
 */
public class GuardadorDeContas {

	private Conta[] referencias;
	private int posicaoLivre;

	/**
	 * Método publico para ser chamado ao criar a classe.
	 */
	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
	}

	/**
	 * Método que atribui uma conta no array com a possição livre.
	 * 
	 * @param ref
	 */
	public void adiciona(Conta ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}

	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}

	public Conta getReferencia(int pos) {
		return this.referencias[pos];
	}
}
