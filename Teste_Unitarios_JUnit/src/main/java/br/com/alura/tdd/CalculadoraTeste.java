package br.com.alura.tdd;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * Programa que demostra a utilização do JUnit.
 * 
 * @author devpovoa
 *
 */
public class CalculadoraTeste {

	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3, 7);

		Assert.assertEquals(10, soma);

	}
}
