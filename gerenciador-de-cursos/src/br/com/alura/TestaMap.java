package br.com.alura;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Programa que demostra o do Map e suas 3 camadas.
 * 
 * @author devpovoa
 *
 */
public class TestaMap {

	public static void main(String[] args) {

		Map<String, Integer> nomesParaIdade = new HashMap<>();
		nomesParaIdade.put("Thiago Povoa", 36);
		nomesParaIdade.put("Daiana Povoa", 32);
		nomesParaIdade.put("Ysabelle Povoa", 14);
		nomesParaIdade.put("Arthur Povoa", 1);

		// Para acessar as chaves.
		Set<String> Chaves = nomesParaIdade.keySet();
		for (String nome : Chaves) {
			System.out.println("Nome: " + nome);
		}
		System.out.println();
		
		// Para acessar valores.
		Collection<Integer> valores = nomesParaIdade.values();
		for (Integer idade : valores) {
			System.out.println("Idade: " + idade);
		}
		System.out.println();
		
		// Para acessa a associação.
		Set<java.util.Map.Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();
		for (java.util.Map.Entry<String, Integer> associacao : associacoes) {
			System.out.println("Nome: " + associacao.getKey() + " - " + "Idade: " + associacao.getValue());
		}
	}
}
