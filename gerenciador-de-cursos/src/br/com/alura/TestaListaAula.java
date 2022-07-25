package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaAula {

	public static void main(String[] args) {

		Aula a1 = new Aula("Revisando as ArraysLists", 21);
		Aula a2 = new Aula("Lista de Objetos", 20);
		Aula a3 = new Aula("Relacionamento de Listas de Objetos", 16);

		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);

		aulas.forEach(aula -> {
			System.out.println(aula);
		});
		System.out.println("-----------------------------------------------------");
		Collections.sort(aulas);
		System.out.println(aulas);
		
		System.out.println("-----------------------------------------------------");
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		//aulas.sort(Comparator.comparing(Aula::getTempo)); //mesma sintaxe referente a de cima.
		System.out.println(aulas);
	}

}
