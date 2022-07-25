package br.com.alura.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * Programa que demostra a classificação com as tabelas UNICODES.
 * 
 * @author devpovoa
 *
 */
public class TestaUnicodeEEnconding {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String s = "Ç";
		System.out.println(s.codePointAt(0));

		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());

		byte[] bytes = s.getBytes("UTF-8");
		System.out.print(bytes.length + ", UTF-8, ");
		String sNova = new String(bytes, "UTF-8");
		System.out.println(sNova);

		bytes = s.getBytes("UTF-16");
		System.out.print(bytes.length + ", UTF-16, ");
		sNova = new String(bytes, "UTF-16");
		System.out.println(sNova);

		bytes = s.getBytes("windows-1252");
		System.out.print(bytes.length + ", windows-1252, ");
		sNova = new String(bytes, "windows-1252");
		System.out.println(sNova);

		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.print(bytes.length + ", US-ASCII, ");
		sNova = new String(bytes, "US-ASCII");
		System.out.println(sNova);
	}

}
