package br.com.bytebank.banco.teste;

/**
 * Programa para testar a classe String do pacote java lang.
 * 
 * @author devpovoa
 *
 */
public class TestaString {

	public static void main(String[] args) {

		/**
		 * Verifica se objeto está vazio ou não e verifica ou compara se contém cadeias
		 * de caracteres equivalentes.
		 */
//		String vazio = " ";
//		String novoVazio = vazio.trim();
//		System.out.println(novoVazio.isEmpty());

//		String vazio = "Alura";
//		System.out.println(vazio.contains("Arl"));
//		System.out.println(vazio.contains("Al"));

		/**
		 * Objeto literal, inicializado com uma cadeia de caracteres que não poderá ser
		 * alterado.
		 */
		String nome = "Alura";
		CharSequence seq = "Alura";

		System.out.println(nome);
		System.out.println(seq);
		
		 

		/**
		 * Criação de outro objeto para alterar a cadeia de caracteres a partir de seus
		 * métodos.
		 * 
		 */

//		String outroNome = nome.replace("A", "a");
//		String outroNome = nome.toLowerCase();
//		String outroNome = nome.toUpperCase();
//
//		System.out.println(nome);
//		System.out.println(outroNome);

		/**
		 * método que busca o tamanha do array da String Alura e retorna a possição
		 * solicitada.
		 */

//		System.out.println(nome.length());

//		for (int i = 0; i < nome.length(); i++) {
//			System.out.println(nome.charAt(i));
//		}

//		char c = nome.charAt(2);
//		System.out.println(c);
//		
//		int pos = nome.indexOf("u");
//		System.out.println(pos);
//		
//		String sub = nome.substring(1);
//		System.out.println(sub);
	}

}
