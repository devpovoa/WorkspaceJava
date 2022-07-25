package br.com.alura;

public class TestaCursos {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções", "Thiago Povoa");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com Coleções", 22));

		
		System.out.println(javaColecoes.getAulas());
		
	}

}
