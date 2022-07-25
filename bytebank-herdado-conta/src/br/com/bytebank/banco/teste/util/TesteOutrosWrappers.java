package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Programa que demostra o uso do Autoboxing e Unboxing.
 * 
 * @author devpovoa
 *
 */
public class TesteOutrosWrappers {

	public static void main(String[] args) {

		Integer idadeRef = Integer.valueOf(29);// Autoboxing
		System.out.println(idadeRef.intValue());// Unboxing

		Double dRef = Double.valueOf(3.2);
		System.out.println(dRef.doubleValue());

		Boolean bRef = Boolean.TRUE;
		System.out.println(bRef.booleanValue());

		/**
		 * Todas as Classes Wrappers pertencem ao pacote Java.Lang.Number
		 */

		Number refNumero = Float.valueOf(33.3f);
		System.out.println(refNumero.floatValue());

		List<Number> lista = new ArrayList<>();
		lista.add(10);
		lista.add(32.2f);
		lista.add(32.5);

		System.out.println("\nLista de números inseridos:");
		for (Number numeros : lista) {
			System.out.println(numeros);
		}
	}

}
