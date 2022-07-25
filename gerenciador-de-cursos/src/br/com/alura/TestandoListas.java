package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Programa que demostra a criação de uma lista e o uso de seus métodos.
 * 
 * @author devpovoa
 *
 */
public class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "Conhecendo mais de Listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		/**
		 * Formas de se percorrer uma Lista.
		 */
		for (String aula : aulas) {
			System.out.printf("Aula: %s%n", aula);
		}

		System.out.println("-------------------------------");

		/**
		 * Sempre use desta forma (Lambda).
		 */
		aulas.forEach(aula -> {
			System.out.println("Percorrendo:");
			System.out.println("Aula " + aula);
		});

		// aulas.remove(0);
		System.out.println("-------------------------------");
		/**
		 * Lêr se: para cada String aula dentro de aulas, imprima.
		 */
		for (String aula : aulas) {
			System.out.printf("Aula: %s%n", aula);
		}

		System.out.println("-------------------------------");
		String primeiraAulra = String.format("A primeira aula é %s", aulas.get(0));
		System.out.println(primeiraAulra);

		System.out.println("-------------------------------");
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula: " + aulas.get(i));
		}
		System.out.println("-------------------------------");

		/**
		 * Uso da Classe Collections
		 */

		aulas.add("Aumentando nosso conhecimento");
		Collections.sort(aulas);
		String listaOrdenada = String.format("Lista de strings Ordenadas: %n%s", aulas);

		System.out.println(listaOrdenada);
	}
}
