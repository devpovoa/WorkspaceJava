package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsufucienteExecption;

public class TestaContas {

	public static void main(String[] args) throws SaldoInsufucienteExecption {

		ContaCorrente novaCc = new ContaCorrente(3028, 247412);
		novaCc.deposita(500);

		ContaPoupanca novaPp = new ContaPoupanca(3028, 247413);
		novaPp.deposita(250);

		System.out.println("Conta Corrente: " + novaCc.getSaldo());
		System.out.println("Conta Poupança: " + novaPp.getSaldo());

		novaCc.transfere(10.0, novaPp);
		System.out.print("\n");
		System.out.println("Novo saldo CC: " + novaCc.getSaldo());
		System.out.println("Novo saldo PP: " + novaPp.getSaldo());

	}
}
