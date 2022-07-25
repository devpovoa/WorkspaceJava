package br.com.alura.io.properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestePropertiesLeitura {

	public static void main(String[] args) throws IOException, Exception {
		Properties props = new Properties();        
		props.load(new FileReader("conf.properties"));

		String login = props.getProperty("login");
		String senha = props.getProperty("senha");
		String endereco = props.getProperty("endereco");

		System.out.println(login + ", " + senha  + ", " +  endereco);

	}

}
