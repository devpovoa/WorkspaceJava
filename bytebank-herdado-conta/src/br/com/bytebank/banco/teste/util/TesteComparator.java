package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

/**
 * Programa que demostra como usar o método de ordernação de lista sort(comparator)
 * 
 * @author devpovoa
 *
 */
public class TesteComparator {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 33);
		cc1.deposita(333.0);

		Conta cc2 = new ContaPoupanca(22, 44);
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente(22, 11);
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupanca(22, 22);
		cc4.deposita(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		/**
		 * Imprime as contas com o foreach antes do método comparator.
		 */
		for (Conta contas : lista) {
			System.out.println(contas);
		}

		System.out.println("---------------------------------------");
		/**
		 * Método sort(comparator) que ordena uma lista.
		 */
		NumeroDaContaComparator compara = new NumeroDaContaComparator();
		lista.sort(compara);
		/**
		 * Imprime as contas com o foreach depois do método comparator.
		 */
		for (Conta contas : lista) {
			System.out.println(contas);
		}
	}
}

/**
 * Método Comparator precisa ser implementado e sobrescrito.
 * 
 * @author devpovoa
 *
 */
class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {

		if (c1.getNumeroDaConta() < c2.getNumeroDaConta()) {
			return -1;
		}
		if (c1.getNumeroDaConta() > c2.getNumeroDaConta()) {
			return 1;
		}
		return 0;
	}

}
