package br.com.alura;

import java.util.LinkedHashMap;
import java.util.Map;

public class Excercicio {

	public static void main(String[] args) {

		Map<Integer, String> pessoas = new LinkedHashMap<>();
		pessoas.put(36, "Thiago Povoa");
		pessoas.put(32, "Daiana Povoa");
		pessoas.put(14, "Ysabelle Povoa");
		pessoas.put(1, "Arthur Povoa");

		/**
		 * chama o nome(value) pelo get().
		 */
		pessoas.keySet().forEach(idade -> {
			System.out.println("Nome: " + pessoas.get(idade));
		});

		System.out.println();
		
		pessoas.values().forEach(pessoa -> {
			System.out.println("Nome: " + pessoa);
		});
		
		pessoas.keySet().forEach(idade -> {
			System.out.println("Idade: " + idade);
		});
	}

}
