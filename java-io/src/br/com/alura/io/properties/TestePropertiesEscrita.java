package br.com.alura.io.properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TestePropertiesEscrita {

	public static void main(String[] args) throws IOException {

		Properties props = new Properties();
		props.setProperty("login", "DevPovoa"); // chave, valor
		props.setProperty("senha", "novodev");
		props.setProperty("endereco", "www.alura.com.br");
		props.store(new FileWriter("conf.properties"), "Configurações de entrada e saída com a classe Properties");

	}

}
