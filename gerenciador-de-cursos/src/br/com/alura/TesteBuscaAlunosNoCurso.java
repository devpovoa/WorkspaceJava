package br.com.alura;

/**
 * Programa que demostra o uso da Interface Map.
 * 
 * @author devpovoa
 *
 */
public class TesteBuscaAlunosNoCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Thiago Povoa");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com Coleções", 24));

		Aluno a1 = new Aluno("Thiago Povoa", 34672);
		Aluno a2 = new Aluno("Daiana Povoa", 56176);
		Aluno a3 = new Aluno("Ysabelle Povoa", 58008);
		Aluno a4 = new Aluno("Arthur Povoa", 247412);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);

		System.out.println("Quem é o aluno com matricula 3467");
		Aluno aluno = javaColecoes.buscaMatriculado(3467);
		System.out.println("aluno: " + aluno);
	}
}
