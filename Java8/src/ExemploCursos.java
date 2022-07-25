import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploCursos {
	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		/**
		 * Uso do Lambda
		 */
//		cursos.sort(Comparator.comparing(c -> c.getAlunos()));
//		cursos.forEach(System.out::println);
//		System.out.println();
		cursos.forEach(c -> System.out.println());
		/**
		 * Uso da Refence
		 */
//		cursos.sort(Comparator.comparing(Curso::getAlunos));
//		cursos.forEach(c -> System.out.println(c.getNome()));
//		System.out.println();
		/**
		 * Uso do método filter da classe Stream
		 */
//		Stream<String> nomes = cursos.stream().map(Curso::getNome);
//		nomes.forEach(System.out::println);
		

//		cursos.stream()
//		.filter(c -> c.getAlunos() > 50)
//		.forEach(c -> System.out.println(c.getNome()));

//		cursos.stream()
//			.filter(c -> c.getAlunos() > 50)
//			.map(Curso::getAlunos)
//			.forEach(System.out::println);

//		int sum = cursos.stream()
//			.filter(c -> c.getAlunos() >= 100)
//			.mapToInt(Curso::getAlunos)
//			.sum();
//		System.out.println(sum);
		
//		cursos.stream()
//			.filter(c -> c.getAlunos() >= 100)
//			.findAny()
//		    .ifPresent(c -> System.out.println(c.getNome()));
		
//		OptionalDouble media = cursos.stream()
//			//.filter(c -> c.getAlunos() >= 100)
//			.mapToInt(Curso::getAlunos)
//			.average();
//		System.out.println(media);
		
//		cursos.stream()
//			.filter(c -> c.getAlunos() >= 100)
//			.collect(Collectors.toMap(
//					c -> c.getNome(),
//					c -> c.getAlunos()))
//			.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos "));
		
		List<Curso> cursosFiltrados = cursos.stream()
			.filter(c -> c.getAlunos() > 50)
			.collect(Collectors.toList());
		cursosFiltrados.forEach(System.out::println);
	}
}
