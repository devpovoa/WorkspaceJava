package br.com.alura.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Programa que escreve em um arquivo .txt.
 * 
 * @author devpovoa
 *
 */
public class TesteEscritaPrintStream {

	public static void main(String[] args) throws IOException {
		/**
		 * Fluxo de saída com arquivo.
		 */
		//PrintStream ps = new PrintStream("arquivo2.txt");
		PrintWriter ps = new PrintWriter("arquivo2.txt", "UTF-8");

		ps.println("Este novo método chama um arquivo do tipo .txt e armazena esta string");
		ps.println();
		ps.println("by DevPovoa");

		ps.close();
	}
}
