package br.com.alura.io.teste;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Programa que faz leitura de um arquivo CSV com a classe Scanner.
 * 
 * @author devpovoa
 *
 */
public class TesteLeituraScanner {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(new File("contas.csv"), "UTF-8");

		while (scan.hasNextLine()) {
			String linha = scan.nextLine();
			// System.out.println(linha);

			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");

			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();

			String linhaFormatada = String.format(new Locale("pt", "BR"),
					"Tipo de Conta: %s%nAgencia: %04d%nNúmero: %05d%nTitular: %s%nSaldo: %.2f%n", tipoConta, agencia,
					numero, titular, saldo);

			System.out.println(linhaFormatada);

			linhaScanner.close();

//			String [] valores = linha.split(",");
//			System.out.println(valores[3]);
		}
		scan.close();
	}
}
