package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

/**
 * Programa que demostra como usar Arrays do tipo referência.
 * 
 * @author devpovoa
 *
 */
public class TesteArrayReferencias {

	public static void main(String[] args) {
		/**
		 * Cria o um array de Contas, porem com valor NULL. Inicialização de contas por
		 * referência em cc1.
		 */
		Conta[] referencias = new Conta[5];
		
		ContaCorrente cc1 = new ContaCorrente(3028, 247412);
		referencias[0] = cc1;
		
		System.out.println("Número da Agencia: " + referencias[0].getAgencia());
		System.out.println("Número da conta Corrente: " + referencias[0].getNumeroDaConta());
		System.out.println("---------------------------------");
		
		ContaPoupanca cc2 = new ContaPoupanca(3028, 247411);
		referencias[1] = cc2;
		
		System.out.println("Número da Agencia: " + referencias[1].getAgencia());
		System.out.println("Número da conta Poupança: " + referencias[1].getNumeroDaConta());
		System.out.println("---------------------------------");
		
		/**
		 * uso do Type Cast para referência.
		 */
		ContaPoupanca ref = (ContaPoupanca) referencias[1];
		System.out.println("Número da conta Poupança: " + cc2.getNumeroDaConta());
		System.out.println("Número da conta Poupança: " + ref.getNumeroDaConta());
		
	}

}
