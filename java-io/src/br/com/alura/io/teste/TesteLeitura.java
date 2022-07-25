package br.com.alura.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Programa que lê um arquivo .txt.
 * 
 * @author devpovoa
 *
 */
public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		/**
		 * Fluxo de entrada com arquivo. Padrão Decorator
		 */
		InputStream fis = new FileInputStream("arquivo.txt");// lê o arquivo selecionado.
		Reader isr = new InputStreamReader(fis, "UTF-8");// transforma os bytes em caracteres
		BufferedReader br = new BufferedReader(isr);// usado lê uma linha inteira de caracteres.

		String linha = br.readLine();

		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}

		br.close();
	}
}
