package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

/**
 * Programa que demostra a usabilidade da classe ArrayList
 * 
 * @author devpovoa
 *
 */
public class TesteLinkedList {

	public static void main(String[] args) {

		/**
		 * Classe ArrayList com referencia lista e nome. Usando Generics para apontar
		 * qual tipo de classe vou usar.
		 */
		ArrayList<Conta> lista = new ArrayList<Conta>();
		/**
		 * ArrayList com generics String.
		 */
		ArrayList<String> nomes = new ArrayList<String>();

		nomes.add("Thiago");
		System.out.println(nomes.get(0));
		System.out.println("Tamanho ArrayList: " + nomes.size());

		nomes.add("Daiana");
		System.out.println(nomes.get(1));
		System.out.println("Tamanho ArrayList: " + nomes.size());
		
		for (String listaNomes : nomes) {
			System.out.println(listaNomes);
		}

		Conta cc = new ContaCorrente(3028, 247412);
		lista.add(cc);

		Conta cc1 = new ContaCorrente(3028, 247415);
		lista.add(cc1);

//		System.out.println(lista.size());
//		System.out.println(lista.get(0));

		System.out.println(lista.size());

		/**
		 * Classe Conta que faz uso da referencia a lista com um type Cast.
		 */
		Conta ref = (Conta) lista.get(0);
		System.out.println(ref.getNumeroDaConta());

		/**
		 * método que remove da referencia da posição.
		 */
		lista.remove(0);
		System.out.println(lista.size());

		Conta cc2 = new ContaCorrente(3028, 247417);
		lista.add(cc2);

		Conta cc3 = new ContaCorrente(3028, 247418);
		lista.add(cc3);

//		for (int i = 0; i < lista.size(); i++) {
//			Object oRef = lista.get(i);
//			System.out.println(oRef);
//		}

		/*
		 * ForEach
		 */
		for (Conta conta : lista) {
			System.out.println(conta);
		}
	}

}
