package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

/**
 * Programa que demostra a usabilidade da classe LinkedList, ArrayList, Vector e
 * como torna um Array em ArrayList.
 * 
 * @author devpovoa
 *
 */
public class TesteArrayList {

	public static void main(String[] args) {
		/**
		 * Transformando o Arrays do método main em ArrayList.
		 */
		// List<String> argumentos = Arrays.asList(args);

		/**
		 * Classe List com referencia lista. Usando Generics para apontar qual tipo de
		 * classe vou usar.
		 */
		// List<Conta> lista = new LinkedList<Conta>();
		// List<Conta> lista = new Vector<Conta>();
		List<Conta> lista = new ArrayList<Conta>();
		// Collection<Conta> lista = new ArrayList<Conta>();

		Conta cc = new ContaCorrente(3028, 247412);
		lista.add(cc);

		Conta cc1 = new ContaCorrente(3028, 247415);
		lista.add(cc1);

//		System.out.println(lista.size());
//		System.out.println(lista.get(0));

		System.out.println("tamanho " + lista.size());

		/**
		 * Classe Conta que faz uso da referencia a lista com um type Cast.
		 */
		Conta ref = (Conta) lista.get(0);
		System.out.println(ref.getNumeroDaConta());

		/**
		 * método que remove da referencia da posição.
		 */
		lista.remove(0);
		System.out.println("tamanho " + lista.size());

		Conta cc2 = new ContaCorrente(3028, 247417);
		lista.add(cc2);

		Conta cc3 = new ContaCorrente(3028, 247418);
		lista.add(cc3);

		for (int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		System.out.println("------------------------------");
		/**
		 * ForEach
		 */
		for (Conta conta : lista) {
			System.out.println(conta);
		}
	}

}
