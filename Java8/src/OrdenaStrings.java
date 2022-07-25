import java.util.ArrayList;
import java.util.List;

/**
 * Programa que demostra como era percorrido uma Lista e como agora se usa o
 * método default, reference e Lambda no java 8.
 * 
 * @author devpovoa
 *
 */
public class OrdenaStrings {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do código");
		palavras.add("caelum");

//		Comparator<String> comparador = new ComparadorPorTamanho();
//
//		Collections.sort(palavras, comparador);// ordena as Strings de forma alfabetica e depois com uso de comparador.
//		palavras.sort(comparador);
//		System.out.println(palavras);

//		for (String p : palavras) {
//			System.out.println(p);
//		}

//		Consumer<String> consumidor = new Consumer<String>() {
//			@Override
//			public void accept(String s) {
//				System.out.println(s);
//			}
//		};

//		palavras.forEach(new Consumer<String>() {
//			@Override
//			public void accept(String s) {
//				System.out.println(s);
//			}
//		});

//		palavras.forEach(consumer -> System.out.println(consumer));
		palavras.forEach(System.out::println);

//		palavras.sort((String s1, String s2) -> {
//			if (s1.length() < s2.length())
//				return -1;
//			if (s1.length() > s2.length())
//				return 1;
//			return 0;
//		});
//		System.out.println(palavras);

//		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

//		palavras.sort(Comparator.comparing(s -> s.length()));

//		palavras.sort(Comparator.comparing(String::length));
//		
//		System.out.println(palavras);

//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("Executando um Runnable");
//			}
//		}).start();
//		
//		new Thread(()-> System.out.println("Executando um Runnable")).start();
	}
}
