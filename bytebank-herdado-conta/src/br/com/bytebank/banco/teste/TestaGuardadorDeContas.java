package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TestaGuardadorDeContas {

	public static void main(String[] args) {
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(3028, 247412);
		guardador.adiciona(cc);
		
		Conta cc1 = new ContaCorrente(3028, 247415);
		guardador.adiciona(cc1);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencia(1);
		System.out.println(ref);
		
		
	}

}
