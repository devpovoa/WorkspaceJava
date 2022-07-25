package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

/**
 * Programa que testa a perfomance de um ArrayList e um HashSet.
 * 
 * @author devpovoa
 *
 */
public class TestaPerfomance {

	public static void main(String[] args) {

//		Collection<Integer> numeros = new ArrayList<Integer>();
		Collection<Integer> numeros = new HashSet<>();
		long inicio = System.currentTimeMillis();

		for (int i = 1; i < 50000; i++) {
			numeros.add(i);
		}

		numeros.forEach(numero -> {
			numeros.contains(numero);
		});

		long fim = System.currentTimeMillis();

		long tempoDeExecucao = fim - inicio;

		System.out.println("Tempo gasto: " + tempoDeExecucao);

	}

}
