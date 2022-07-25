package br.com.alura.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Programa que mede o tempo de escrita de um código.
 * 
 * @author devpovoa
 *
 */
public class TesteEscritaFileWriterMillis {
	public static void main(String[] args) throws IOException {

		long ini = System.currentTimeMillis();

		BufferedWriter bw = new BufferedWriter(new FileWriter("arquivo2.txt"));

		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bw.newLine();
		bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");

		bw.close();

		long fim = System.currentTimeMillis();

		System.out.println("Passaram " + (fim - ini) + " milissegundos");
		
	}
}
