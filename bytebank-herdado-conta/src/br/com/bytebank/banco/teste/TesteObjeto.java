package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

/**
 * Programa que demostra a utilização da classe Object que o java.lang
 * implementa.
 * 
 * @author devpovoa
 *
 */
public class TesteObjeto {

	public static void main(String[] args) {

//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);

		/**
		 * exemplo de polimorfismo.
		 */
		ContaCorrente cc = new ContaCorrente(3028, 247412);
		Object cp = new ContaPoupanca(3028, 247115);
		// Object cliente = new Cliente();

		/**
		 * métodos que a classe Object contém.
		 */
		System.out.println(cc.toString());
		System.out.println(cp);
		// System.out.println(cliente);
	}

}
