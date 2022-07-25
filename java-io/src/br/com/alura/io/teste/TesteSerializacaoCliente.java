package br.com.alura.io.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Programa que demostra o uso da Serialização em Java.io
 * 
 * @author devpovoa
 *
 */
public class TesteSerializacaoCliente {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		Cliente cliente = new Cliente();
//		cliente.setNome("Thiago Povoa");
//		cliente.setProfissao("Dev");
//		cliente.setCpf("123.456.789-10");
//
//
//
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		oos.writeObject(cliente);
//		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cliente = (Cliente) ois.readObject();
		ois.close();
		System.out.println(cliente.getNome());
		
	}
}
