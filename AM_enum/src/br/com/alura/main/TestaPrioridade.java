package br.com.alura.main;

/**
 * Classe que chama e testa a classe Prioridade.
 * 
 * @author devpovoa
 *
 */
public class TestaPrioridade {

	public static void main(String[] args) {

		/**
		 * Enums não podem ser instânciados como objetos, mas podem ser chamados como
		 * classe.
		 */
		Prioridade pMin = Prioridade.MIN;
		Prioridade pNor = Prioridade.NORMAL;
		Prioridade pMax = Prioridade.MAX;

		/**
		 * Enums possuem métodos pré-definidos no Java.
		 */
		System.out.println(pMin.name());
		System.out.println(pNor.name());
		System.out.println(pMax.name());
		System.out.println();

		/*
		 * Enums cria a ordem de prioridades quando criados.
		 */
		System.out.println(pMin.ordinal());
		System.out.println(pNor.ordinal());
		System.out.println(pMax.ordinal());
		System.out.println();

		/**
		 * Prioridades criadas a partir de personalização com o método getValor().
		 */
		System.out.println(pMin.getValor());
		System.out.println(pNor.getValor());
		System.out.println(pMax.getValor());
		System.out.println();
	}
}
