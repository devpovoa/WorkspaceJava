package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * Classe Set e HashSet do pacote Java Collection.
 * 
 * @author devpovoa
 *
 */
public class TestaAlunos {

	public static void main(String[] args) {

		/**
		 * Demostraçao do uso do Set que é mais rápido na busca binária.
		 */
		Collection<String> alunos = new HashSet<>();
		//Set<String> alunos = new HashSet<>();
		alunos.add("Thiago Povoa");
		alunos.add("Daiana Povoa");
		alunos.add("Ysabelle Povoa");
		alunos.add("Arthur");
		alunos.add("Thiago Povoa");
		
		boolean thiagoEstaMatriculado = alunos.contains("Thiago Povoa");
		alunos.remove("Thiago Povoa");
		System.out.println(thiagoEstaMatriculado);

		System.out.println(alunos.size());
		/**
		 * a classe Set do pacote Collection não aceita repetições.
		 */
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		System.out.println();
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});

		System.out.println(alunos);
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
		Collections.sort(alunosEmLista);
		System.out.println(alunosEmLista);

	}

}
