package br.com.bytebank.banco.teste;

/**
 * Programa que demostra como usar Arrays do tipo referência.
 * 
 * @author devpovoa
 *
 */
public class TesteArrayString {
	/**
	 * No método main existe um Array por referência(String[]) com seu
	 * argumento(args).
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Funcionou");

		/**
		 * Demostração que a classe String[] args do método main é um array. Teste feito
		 * pela linha de comando do terminal.
		 */
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}

}
