package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.CalculadorImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

/**
 * Método Main que realiza testes de tributação.
 * 
 * @author devpovoa
 * @version 0.1
 */
public class TesteTributaveis {

	public static void main(String[] args) {

		// Full Qualified Name - FQN
		ContaCorrente novaCc = new ContaCorrente(222, 333);
		novaCc.deposita(100);

		SeguroDeVida seguro = new SeguroDeVida();

		CalculadorImposto calcula = new CalculadorImposto();
		calcula.regitra(novaCc);
		calcula.regitra(seguro);

		System.out.println(calcula.getTotalImposto());

	}

}
