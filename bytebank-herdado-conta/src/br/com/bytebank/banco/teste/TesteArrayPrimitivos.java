package br.com.bytebank.banco.teste;

/**
 * Programa que demostra como usar Arrays do tipo primitivo..
 * 
 * @author devpovoa
 *
 */
public class TesteArrayPrimitivos {

	public static void main(String[] args) {
		/**
		 * forma de instânciar um objeto Array. Todo array inicializa com seus valores
		 * de forma automatica.
		 */
		int[] idades = new int[5];

		/**
		 * Atribuindo um valor a posição 0 "zero". Utilizando a varivel temporaria
		 * idade1 para referência o array.
		 */
//		idades[0] = 36;
//		idades[1] = 1;
//		idades[2] = 55;
//		idades[3] = 14;
//		idades[4] = 32;
//		int idade1 = idades[0];
//		System.out.printf("Acessando o local 0 igual á:%d.%n", idade1);

		/**
		 * usado o atributo .length para ver o tamanha o objeto.
		 */
//		System.out.println("Tamanho total do array é de: " + idades.length);
		/**
		 * Inicializando um array com for.
		 */
		for (int i = 0; i < idades.length; i++) {
			idades[i] = i + 1;
		}
		for (int i = 0; i < idades.length; i++) {
			int exibeIndice = idades[i];
			System.out.println(exibeIndice);
		}
	}

}
