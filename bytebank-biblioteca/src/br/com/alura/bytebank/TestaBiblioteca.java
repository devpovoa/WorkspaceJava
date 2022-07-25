package br.com.alura.bytebank;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestaBiblioteca {

	public static void main(String[] args) {
		Conta novaC = new ContaCorrente(3028, 123456);
		
		novaC.deposita(500);
		System.out.println(novaC.getSaldo());
	}
}
