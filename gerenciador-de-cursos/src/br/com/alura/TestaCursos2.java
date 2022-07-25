package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCursos2 {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções", "Thiago Povoa");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com Coleções", 24));

		List<Aula> aulaImutaveis = javaColecoes.getAulas();
		System.out.println(aulaImutaveis);
		
		System.out.println("----------------------------------");
		
		System.out.println(javaColecoes);
		
		System.out.println("Total de hora/minutos em curso: " + javaColecoes.getTempoTotal());
		
		System.out.println("----------------------------------");

		/**
		 * chamando uma Lista dentro de outra Lista, clonando uma para dentro da outra. 
		 */
		List<Aula> aulasMutaveis = new ArrayList<>(aulaImutaveis);

		Collections.sort(aulasMutaveis);
		System.out.println(aulasMutaveis);
		
		System.out.println("----------------------------------");

		aulasMutaveis.forEach(aulas -> {
			System.out.println(aulas);
		});
	}

}
