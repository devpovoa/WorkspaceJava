package br.com.alura.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Programa que escreve em um arquivo .txt.
 * 
 * @author devpovoa
 *
 */
public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		/**
		 * Fluxo de saída com arquivo. Padrão Decorator(implicito)
		 */
//		OutputStream fos = new FileOutputStream("arquivo2.txt");// escreve em um arquivo selecionado.
//		Writer osw = new OutputStreamWriter(fos);// transforma os caracteres em bytes.
//		BufferedWriter bw = new BufferedWriter(osw);// usado para escrever uma linha inteira de bytes.

//		FileWriter writer = new FileWriter("arquivo2.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter("arquivo2.txt"));

		bw.write("Este novo método chama um arquivo do tipo .txt e armazena esta string");
//		writer.write(System.lineSeparator());
//		writer.write(System.lineSeparator());
		bw.newLine();
		bw.newLine();
		bw.write("by DevPovoa");

		bw.close();
	}
}
