package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsufucienteExecption;

public class TesteSaca {

	public static void main(String[] args) {
		ContaCorrente novaCc = new ContaCorrente(3028, 24712);

		novaCc.deposita(1000.0);
		System.out.println(novaCc.getSaldo());
		try {
			novaCc.sacar(1100.0);
		} catch (SaldoInsufucienteExecption e) {
			System.out.println("Ex: " + e.getMessage());
		}

		System.out.println(novaCc.getSaldo());

	}

}
