package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

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

		System.out.println("Todos os alunos matriculados: ");

		/**
		 * Uso do Iterator
		 */
		Set<Aluno> alunos = javaColecoes.getAlunos();
		
		Iterator<Aluno> iterador = alunos.iterator();

		while (iterador.hasNext()) {
			Aluno proximoAluno = iterador.next();
			System.out.println(proximoAluno);
		}

		System.out.println();
		/**
		 * Uso do Lambda.
		 */
//		javaColecoes.getAlunos().forEach(a -> {
//			System.out.println(a);
//		});

		System.out.println("O aluno " + a1 + " está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));

		Aluno thiago = new Aluno("Thiago Povoa", 34672);
		System.out.println("E esse Thiago, está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(thiago));

		System.out.println("O a1 é igual ao Thiago Povoa?");
		System.out.println(a1.equals(thiago));

		System.out.println(a1.hashCode() == thiago.hashCode());

	}

}
