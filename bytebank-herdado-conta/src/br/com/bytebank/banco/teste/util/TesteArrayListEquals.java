package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

/**
 * Programa que demostra a usabilidade da classe ArrayList-Equals.
 * 
 * @author devpovoa
 *
 */
public class TesteArrayListEquals {

	public static void main(String[] args) {

		/**
		 * Classe ArrayList com referencia lista e nome. Usando Generics para apontar
		 * qual tipo de classe vou usar.
		 */
		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc = new ContaCorrente(3028, 247412);
		lista.add(cc);

		Conta cc1 = new ContaCorrente(3028, 247415);
		lista.add(cc1);

		Conta cc2 = new ContaCorrente(3028, 247415);

		boolean verifica = lista.contains(cc2);
		System.out.printf("já existe: %b%n", verifica);

		/**
		 * ForEach
		 */
		for (Conta conta : lista) {
			System.out.println(conta);
		}
//		Conta cc = new ContaCorrente(3028, 247412);
//		Conta cc1 = new ContaCorrente(3028, 247415);
//		Conta cc2 = new ContaCorrente(3028, 247415);
//		
//		boolean igual = cc1.ehIgual(cc2);
//		System.out.println(igual);
	}

}
