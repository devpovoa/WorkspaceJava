package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Programa que mostra formas de declarar um Array.
 * 
 * @author devpovoa
 *
 */
public class TesteWrapperInteger {

	public static void main(String[] args) {
		/**
		 * Uma Array pode ser definido como do tipo primitivo, por referências ou por
		 * Listas onde só existem referências a um objeto.
		 */
//		int[] idades = new int[5];
//		String[] nomes = new String[5];

		/**
		 * Autoboxing ou Unboxing= é a transformação de um primitivo para uma
		 * referência, ou vise-versa.
		 */
		int idade = 29;

		Integer idadeRef = Integer.valueOf(idade);// Autoboxing
		//int valor = idadeRef.intValue();// Unboxing
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29);
		/**
		 * Também é possivel converter tipos e saber tamanhos maximos e minimos de uma tipo.
		 */
		
		System.out.println("Maximo de um Integer: " + Integer.MAX_VALUE);
		System.out.println("Minimo de um Integer: " + Integer.MIN_VALUE);
		System.out.println("Tamanho em bits de um Integer: " + Integer.SIZE);
		System.out.println("Tamanho em bytes de um Integer: " + Integer.BYTES);
		
		System.out.printf("Convertendo um inteiro %d para um double %.1f%n",idade, idadeRef.doubleValue());
		String s = "10";
		System.out.printf("Valor do tipo String %s.%n", s);
		int numero = Integer.parseInt(s);
		System.out.printf("Valor do tipo inteiro %d.", numero);
	}

}
