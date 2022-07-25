package br.com.alura.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * Programa que escreve em um arquivo .txt.
 * 
 * @author devpovoa
 *
 */
public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		/**
		 * Fluxo de saída com arquivo. Padrão Decorator
		 */
		OutputStream fos = new FileOutputStream("arquivo2.txt");// escreve em um arquivo selecionado.
		Writer osw = new OutputStreamWriter(fos);// transforma os caracteres em bytes.
		BufferedWriter bw = new BufferedWriter(osw);// usado para escrever uma linha inteira de bytes.

		bw.write("Este método chama um arquivo do tipo .txt e armazena esta string");
		bw.newLine();
		bw.newLine();
		bw.write("by DevPovoa");
		
		bw.close();
	}
}
